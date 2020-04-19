package inversionofcontrol;

public class TrackCoach implements Coach {

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










