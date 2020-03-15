package com.yzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("testSpringBootController")
    public String testSpringBootController(){
        System.out.println("testSpringBootController36888....");
        return "TestController";
    }
}
