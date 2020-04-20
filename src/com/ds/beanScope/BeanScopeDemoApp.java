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
		boolean result = (theCoach == alphaCoach);//check the memory location to verify object type prototype or singleton
		System.out.println("Pointing to the same project:" + result);
		System.out.println("Memory Locationn of thecoach: " + theCoach);
		System.out.println("Memory Location of alpha coach: " + alphaCoach);
		
		context.close();
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("beanscope.annotation.applicationContext.xml");
		
		// retrieve bean from spring container
		ScopeCoach scopeCoach1 = context2.getBean("scopeAnnotationCricketCoach", ScopeCoach.class);
		
		System.out.println("MSG: " + scopeCoach1.getDailyFortune());
		System.out.println("MSG: " + scopeCoach1.getDailyWorkout());
		
		ScopeCoach scopeCoach2 = context2.getBean("scopeAnnotationCricketCoach", ScopeCoach.class);
		
		boolean result2 = (scopeCoach1==scopeCoach2);
			System.out.println("scopeCoach2 Are Same :" + result2);
			System.out.println("Memory Locationn of scopeCoach1: " + scopeCoach1);
			System.out.println("Memory Location of scopeCoach2: " + scopeCoach2);
		
		
		context2.close();
		
	}

}
