package com.ds.inversionofcontrol;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		// Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());		
		
		System.out.println("Second Coach");
		
		Coach theCoach2 = new BaseballCoach();
		
		// use the object
		System.out.println(theCoach2.getDailyWorkout());		

	}

}
