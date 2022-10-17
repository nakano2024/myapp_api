package com.example.admin.service;

import com.example.admin.repository.ThreadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class BackGroundRunner {

    @Autowired
    ThreadRepository threadRepository;

    @Scheduled(fixedDelay = 1000)
    void monitorThreads(){
        threadRepository.updateIsClosed();
    }

}