package com.application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/home")
    public String salesForceObject(){
        return "home";
    }

    @GetMapping("/home")
    public String getSalesForceObject(){
        return "home";
    }
}
