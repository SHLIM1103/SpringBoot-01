package com.example.demo.controllers;

import com.example.demo.services.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController{
    @GetMapping("/")
    public String index(){
        return "index";
    }
}