package com.example.jenkinsDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    public String welcome() {
        return "👋 Welcome to Jenkins Demo Spring Boot App!";
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "✅ Application is running!";
    }
}
