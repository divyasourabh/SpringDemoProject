package com.ds.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ds.inversionofcontrol.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope.applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		boolean result = (theCoach == alphaCoach);
		System.out.println("Pointing to the same project:" + result);
		System.out.println("Memory Locationn of thecoach: " + theCoach);
		System.out.println("Memory Location of alpha coach: " + alphaCoach);
		
		context.close();
	}

}
