package com.ds.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ds.inversionofcontrol.Coach;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beansLifecycle.applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		Coach alphaCoach = context.getBean("alphaCoach", Coach.class);
		
		System.out.println(alphaCoach.getDailyWorkout());
		
		System.out.println(alphaCoach.getDailyFortune());
		
		context.close();
	}

}
