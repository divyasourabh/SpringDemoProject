package inversionofcontrol;

public class BaseballCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		System.out.println("BaseballCoach: No arg Constructor");
	}
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {		
		// use my fortuneService to get a fortune		
		return fortuneService.getFortune();
	}

}








