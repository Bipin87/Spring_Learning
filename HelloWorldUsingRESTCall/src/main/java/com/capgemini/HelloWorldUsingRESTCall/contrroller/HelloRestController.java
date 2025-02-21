package com.capgemini.HelloWorldUsingRESTCall.contrroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    // Simple GET API returning a plain text response
    @GetMapping("/")
    public String hello() {
        return "Hello from Bridgelabz!";
    }

    // GET API that accepts a query parameter and returns a custom message
    @GetMapping("/api/message")
    public String customMessage(@RequestParam(value = "name", defaultValue = "Bipin") String name) {
        return "Hello, " + name + "! Welcome to the REST API.";
    }
}
