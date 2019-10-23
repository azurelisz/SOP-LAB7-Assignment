package com.example.demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {
    @Value("${name}")
    private String name;

    public String getName(){
        return name;
    }
}
