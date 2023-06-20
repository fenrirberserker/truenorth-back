package com.truenorth.project.controller;

import com.truenorth.project.model.dto.Operation;
import com.truenorth.project.model.dto.Result;
import com.truenorth.project.model.dto.User;
import com.truenorth.project.service.OperationService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    OperationService srv;

    @GetMapping(path = "/hello")
    public ResponseEntity<String> hello(){
/*
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        String info = authentication.getPrincipal().toString();
        System.out.println("name: "+currentPrincipalName+" info "+info);*/
        return ResponseEntity.ok("Hello");
    }

    @PostMapping(path = "/calculator")
    public Object getOperation(@RequestBody Operation operation){

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
//        authentication.getCredentials().
        String info = authentication.getPrincipal().toString();
        User user = new User(0,"user","pass",true, 1000.0);

        return srv.getOperation(user, operation);
    }
}
