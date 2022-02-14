package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController

public class WelcomeController {
    @GetMapping("/welcome")
    public String HelloWorld(){
        return "Hello All, We did it!! Deployment with Heroku!!!";
    }
}
