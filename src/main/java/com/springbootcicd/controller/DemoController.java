package com.springbootcicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String demo(){
        return "Springboot CI/CD is now working fine";
    }
}