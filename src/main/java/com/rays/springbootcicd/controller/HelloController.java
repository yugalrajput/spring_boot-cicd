package com.rays.springbootcicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getMessage() {
        return "Hello yugal rajput !! ";
    }

    @GetMapping("/welcome")
    public String getMessage1() {
        return "Welcome yugal rajput !! ";
    }


}
