package com.micro.service.ServiceRegistry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    // adding a comment here.
    // this endpoint returns hello.
    @GetMapping("/employee")
    public String getEmployee(){
        return "Hello";
    }
}
