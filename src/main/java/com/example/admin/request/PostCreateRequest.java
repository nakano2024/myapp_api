package com.example.admin.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class PostCreateRequest {

    private String content;

}
