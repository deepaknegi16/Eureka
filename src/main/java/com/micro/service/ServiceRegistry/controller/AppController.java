package com.micro.service.ServiceRegistry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    // adding a comment here.
    // this endpoint returns hello.
    // this is change from local branch
    // this is change from master
    @GetMapping("/employee")
    public String getEmployee(){
        return "Hello";
    }
}
