package com.ds.annotation;

import org.springframework.stereotype.Component;

import com.ds.inversionofcontrol.Coach;

@Component("theTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return "Tennis sample daily fortune";
	}

}
