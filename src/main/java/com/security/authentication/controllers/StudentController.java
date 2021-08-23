package com.security.authentication.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/public")
    public String all() {
        return "Hi, I am /public \n" +
                "I dont require authentication";
    }

    @GetMapping("/")
    public String home() {
        return "You are logged in";
    }
}
