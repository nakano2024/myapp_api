package com.example.admin.service;

import com.example.admin.entity.Thread;
import com.example.admin.entity.User;
import com.example.admin.logic.ThreadLogic;
import com.example.admin.logic.UserLogic;
import com.example.admin.repository.ThreadRepository;
import com.example.admin.request.ThreadCreateRequest;
import com.example.admin.response.ThreadResponse;
import com.example.admin.security.MyUserDetails;
import com.example.admin.utility.SecurityUtil;
import com.example.admin.utility.TimestampUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
public class ThreadServiceImpl implements ThreadService{

    @Autowired
    ThreadRepository threadRepository;

    @Autowired
    TimestampUtil timestampUtil;

    @Autowired
    SecurityUtil securityUtil;

    @Autowired
    ThreadLogic threadLogic;

    @Autowired
    UserLogic userLogic;

    @Override
    public void createThread(Authentication auth, HttpServletRequest req, ThreadCreateRequest reqBody) {

        if(auth == null ||req == null || reqBody == null ){return;}
        MyUserDetails userDetails = (MyUserDetails) auth.getPrincipal();

        if(userDetails == null){return;}
        Thread thread = new Thread();
        thread.setTitle(reqBody.getTitle());
        User user = userLogic.getEntitiyByUserId(userDetails.getUserId());
        thread.setUser(user);
        thread.setIp(req.getRemoteAddr());
        thread.setValid(true);
        thread.setCreatedAt(timestampUtil.getNow());
        threadRepository.save(thread);

    }

    @Override
    public List<ThreadResponse> getAllResponses() {
        List<Thread> threads = threadRepository.findAll();
        List<ThreadResponse> threadResponses = new ArrayList<>();
        threads.forEach((Thread thread)->{
            threadResponses.add(new ThreadResponse(thread));
        });
        return threadResponses;
    }

    @Override
    public List<ThreadResponse> getAllResponseByUserId(Long userId) {
        List<Thread> threads = threadRepository.findAllByUserId(userId);
        List<ThreadResponse> threadResponses = new ArrayList<>();
        threads.forEach((Thread thread)->{
            threadResponses.add(new ThreadResponse(thread));
        });
        return threadResponses;
    }

    @Override
    public ThreadResponse getResponseByThreadId(Long threadId) {
        Thread thread = threadLogic.getEntityByThreadId(threadId);
        return new ThreadResponse(thread);
    }

    @Override
    public void validateByThreadId(Long threadId) {
        Thread thread = threadLogic.getEntityByThreadId(threadId);
        //falseの時trueにする
        if(!thread.isValid()) {
            thread.setValid(true);
            thread.setUpdatedAt(timestampUtil.getNow());
            threadRepository.save(thread);
        }
    }

    @Override
    public void invalidateByThreadId(Long threadId) {
        Thread thread = threadLogic.getEntityByThreadId(threadId);
        //trueの時falseにする
        if(thread.isValid()) {
            thread.setValid(false);
            thread.setUpdatedAt(timestampUtil.getNow());
            threadRepository.save(thread);
        }
    }

    @Override
    public void deleteByThreadId(Long threadId , Authentication auth) {
        //スレッドを立てたユーザーと、認証を受けたユーザーが一致しなければアクセス拒否
        if(auth == null){return;}
        MyUserDetails userDetails = (MyUserDetails)auth.getPrincipal();
        Thread thread = threadLogic.getEntityByThreadId(threadId);
        if(!securityUtil.isAuthIdEqualPathId(userDetails.getUserId() , thread.getUser().getUserId())
                && securityUtil.isAdmin(userDetails.getAuthorities()))
        {
            throw new AccessDeniedException("");
        }
        threadRepository.delete(thread);
    }
}