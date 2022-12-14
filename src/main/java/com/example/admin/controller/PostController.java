package com.example.admin.controller;

import com.example.admin.repository.PostRepository;
import com.example.admin.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;


@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    PostService postService;

    @GetMapping("/auth/admin/post")
    ResponseEntity<?> getAll(){
        return ResponseEntity.ok(postService.getAllResponses());
    }

    @GetMapping("/auth/admin/post/{postId}")
    ResponseEntity<?> getByPostId(@PathVariable Long postId){
        return ResponseEntity.ok(postService.getResponseByPostId(postId));
    }

    @DeleteMapping("/auth/post/{postId}/delete")
    ResponseEntity<?> delete(Authentication auth , @PathVariable Long postId){
        postService.deleteByPostId(postId , auth);
        return ResponseEntity.ok(null);
    }

}
