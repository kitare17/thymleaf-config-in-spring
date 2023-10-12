package com.example.thymleafconfiginspring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}