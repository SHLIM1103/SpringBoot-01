package com.example.demo.controllers;

import com.example.demo.utils.Proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Autowired Proxy px;
    @PostMapping("/users/1")
    public void join(){
        px.print("서버에 들어옴");
    }
}
