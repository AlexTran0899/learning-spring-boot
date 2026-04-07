package com.example.util;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class PandaCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "master the chopstic";
    }
}
