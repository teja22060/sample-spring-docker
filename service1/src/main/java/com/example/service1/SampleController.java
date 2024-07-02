package com.example.service1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    // Sample REST API 1
    @GetMapping("/api/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // Sample REST API 2
    @GetMapping("/api/square/{number}")
    public int square(@PathVariable int number) {
        return number * number;
    }

    // Health Check API
    @GetMapping("/health")
    public String healthCheck() {
        return "Application is healthy";
    }
}

