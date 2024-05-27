package com.akshay.Quiz.Application;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class QuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		// Vechicle obj = (Vechicle) context.getBean("bike");
		// obj.drive();


		Tyre t = (Tyre) context.getBean("tyre");
		System.out.println(t);
	}

}
