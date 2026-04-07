package com.example.demo_2.util;

import org.springframework.stereotype.Component;

import com.example.util.Coach;

@Component
public class PandaCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "master the chopstic";
    }
}
