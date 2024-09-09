package com.employee.employee.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String getHome() {
        return "<H1>Welcome</H1><br>1. employee/";
    }
    
}
