package com.example.util;

public class SwimCoach implements Coach {

    public void SwimCoach() {
        System.out.println("in the constructor of the SwimCoach class");
    }

    public String getDailyWorkout() {
        return "swim 100 meters each day";
    }
}
