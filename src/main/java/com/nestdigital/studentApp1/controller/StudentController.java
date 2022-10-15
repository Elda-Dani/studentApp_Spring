package com.nestdigital.studentApp1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String HomePage()
    {
        return "welcome to my home page";
    }

    @GetMapping("/contact")
    public  String ContactPage()
    {
        return "Contact Page";
    }
}
