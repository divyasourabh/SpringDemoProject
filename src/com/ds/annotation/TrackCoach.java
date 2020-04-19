package com.ds.annotation;

import org.springframework.stereotype.Component;

import com.ds.inversionofcontrol.Coach;
import com.ds.inversionofcontrol.FortuneService;

@Component("thetrackCoach")
public class TrackCoach implements AnnotationCoach {

	private FortuneService fortuneService;

	public TrackCoach() {
		System.out.println("TrackCoach: No arg Constructor");
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: doMyStartUpStuff");
	}

	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach: doMyCleanUpStuff");
	}

	@Override
	public String getDailyWorkout() {
		return "TrackCoach: Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach: Just Do It: " + fortuneService.getFortune();
	}	
}










