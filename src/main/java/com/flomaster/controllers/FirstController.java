package com.flomaster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }
    @GetMapping("/goodbye")
    public String sayGoodBye(){
        return "goodBye";
    }
}
