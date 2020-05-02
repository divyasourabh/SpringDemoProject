package com.ds.javaconfiguration;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "SwimCoach: Swim for 1hour daily in warm water";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
