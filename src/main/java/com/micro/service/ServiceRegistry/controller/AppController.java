package com.micro.service.ServiceRegistry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    // adding a comment here.
    // this endpoint returns hello.

    // let see what happens to this comment

    // again adding local commect

    // meanwhile a comment in master
    // if i add comment here
    @GetMapping("/employee")
    public String getEmployee(){
        return "Hello";
    }

    @GetMapping("/all")
    public String AllEmployeeName() {
        return "Employees";
    }
// adding the comment on hello
    @GetMapping("/helllo")
    public String JustHelloP() {
        return "just hello";
    }
}
