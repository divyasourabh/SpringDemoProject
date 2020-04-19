package com.ds.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredAnnotationApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowired.annotation.applicationContext.xml");

		AnnotationCoach footballCoach = context.getBean("footballAutowired",AnnotationCoach.class);
		System.out.println("MSG: " + footballCoach.getDailyWorkout());
	}

}
