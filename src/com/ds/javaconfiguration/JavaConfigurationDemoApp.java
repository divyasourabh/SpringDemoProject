package com.ds.javaconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ds.beanScope.ScopeCoach;

public class JavaConfigurationDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve bean from spring container
		ScopeCoach scopeCoach1 = context.getBean("scopeAnnotationCricketCoach", ScopeCoach.class);
		
		System.out.println("MSG: " + scopeCoach1.getDailyFortune());
		System.out.println("MSG: " + scopeCoach1.getDailyWorkout());
		
		ScopeCoach scopeCoach2 = context.getBean("scopeAnnotationCricketCoach", ScopeCoach.class);
		
		boolean result2 = (scopeCoach1==scopeCoach2);
			System.out.println("scopeCoach2 Are Same :" + result2);
			System.out.println("Memory Locationn of scopeCoach1: " + scopeCoach1);
			System.out.println("Memory Location of scopeCoach2: " + scopeCoach2);
		
	}

}
