package com.__springboot.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloworldController {
    @Value("${creator.Name}")
    private String creatorName;

    @Value("${creator.birthCity}")
    private String creatorBirthCity;

    @Value("${creator.birthCountry}")
    private String creatorBirthCountry;

    @GetMapping("/")
    public String sendHelloWorld() {
        return "hello world from " + creatorName;
    }

    @GetMapping("/birth-city")
    public String sendBrithCity() {
        return creatorName + " was borned in the province of " + creatorBirthCity;
    }

    @GetMapping("/birth-country")
    public String sendBirthCountry() {
        return creatorName + " was borned in the country " + creatorBirthCountry;
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day :)";
    }
}
