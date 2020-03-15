package com.yzy.controller;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class TestController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping("testSpringBootController")
    public String testSpringBootController(){
        System.out.println("testSpringBootController36888....");
        System.out.println(dataSource);
        return "TestController";
    }
}
