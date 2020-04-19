package com.ds.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ds.inversionofcontrol.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation.applicationContext.xml");

		Coach theTennisCoach = context.getBean("theTennisCoach",Coach.class);
		System.out.println("MSG: " + theTennisCoach.getDailyWorkout());

		Coach theTrackCoach = context.getBean("thetrackCoach",Coach.class);
		System.out.println("MSG: " + theTrackCoach.getDailyWorkout());
	}

}
