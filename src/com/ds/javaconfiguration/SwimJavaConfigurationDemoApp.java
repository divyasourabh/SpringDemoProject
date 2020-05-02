package com.ds.javaconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigurationDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SwimConfig.class);
		
		// retrieve bean from spring container
		Coach coach = context.getBean("swimCoach", Coach.class);
		
		System.out.println("MSG: " + coach.getDailyFortune());
		System.out.println("MSG: " + coach.getDailyWorkout());
		
	}

}
