package com.truenorth.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello";
    }

    @PostMapping(path = "/")
    public Object getOperation(){
        return null;
    }
}
