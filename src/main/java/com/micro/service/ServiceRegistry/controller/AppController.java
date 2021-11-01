package com.micro.service.ServiceRegistry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/employee")
    public String getEmployee(){
        return "Hello";
    }
}
