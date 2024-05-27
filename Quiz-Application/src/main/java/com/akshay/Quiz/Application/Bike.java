package com.akshay.Quiz.Application;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vechicle{
    public void drive() {
        System.out.println("Drive the bike");
    }
}
