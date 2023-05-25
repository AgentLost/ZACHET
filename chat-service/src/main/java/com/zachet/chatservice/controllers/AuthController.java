package com.zachet.chatservice.controllers;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class AuthController {


    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }
}
