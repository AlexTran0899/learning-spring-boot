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

    // by default the coach object is shared, or is a singleton
    @Autowired
    public void setCoach(@Qualifier("aquatic") Coach theCoach) {
        this.myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getMethodName() {
        return myCoach.getDailyWorkout();
    }
}
