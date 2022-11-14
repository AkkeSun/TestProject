package com.example.testproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String testMapping() {
        return "port : 8083";
    }

    @GetMapping("/ping")
    public String pingMethod() {
        return "ping Success";
    }

}
