package com.example.demo_2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.example.util.Coach;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    // notice that the class name CricketCoach start with the lowercase
    @Autowired
    public void setCoach(@Qualifier("trackCoach") Coach theCoach,
            @Qualifier("trackCoach") Coach anotherCoach) {
                
        this.myCoach = theCoach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getMethodName() {
        return myCoach.getDailyWorkout();
    }
}
