package com.ds.annotation;

import org.springframework.stereotype.Component;

import com.ds.inversionofcontrol.Coach;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "TennisCoach: Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return "TennisCoach: Tennis sample daily fortune";
	}

}
