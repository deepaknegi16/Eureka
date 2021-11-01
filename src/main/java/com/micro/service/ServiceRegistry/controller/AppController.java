package com.micro.service.ServiceRegistry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    // adding a comment here.
    // this endpoint returns hello.

    // let see what happens to this comment

    // again adding local commect


    // if i add comment here
    @GetMapping("/employee")
    public String getEmployee(){
        return "Hello";
    }

    @GetMapping("/all")
    public String AllEmployeeName() {
        return "Employees";
    }
}
