package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class Demo2Application {

    @Autowired
    ServiceConfig config;
    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }


    @RequestMapping("/")
    public String getName(){
        return config.getName();
    }
}
