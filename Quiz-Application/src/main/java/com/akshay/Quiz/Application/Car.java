package com.akshay.Quiz.Application;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vechicle {
   public void drive()
   {
    System.out.println("Drive the car.");
   } 
}
