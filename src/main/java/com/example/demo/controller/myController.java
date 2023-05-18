package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
    @GetMapping("/lab13")
    public String hello(){
        return "hello from Tier 12011919";
    }
}
