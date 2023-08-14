package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJKube {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello JKube";
    }
}
