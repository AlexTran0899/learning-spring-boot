package com.example.util;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling fo 15 minutes";
    }

    @PostConstruct
    public void doStartupStuff(){
        System.out.println("doing startup stuff for (" + getClass().getSimpleName() + ')');
    }

    @PreDestroy
    public void runUponClose(){
        System.out.println("doing closing stuff for (" + getClass().getSimpleName() + ')');
    }

}
