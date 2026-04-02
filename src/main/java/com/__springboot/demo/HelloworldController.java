package com.__springboot.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class HelloworldController {
    @Value("${creatorName}")
    private String creatorName;

    @GetMapping("/")
    public String sendHelloWorld() {
        return "hello world from " + creatorName;
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day :)";
    }
}
