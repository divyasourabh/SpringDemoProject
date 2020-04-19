package beanScope;

import org.springframework.beans.factory.DisposableBean;

import inversionofcontrol.Coach;
import inversionofcontrol.FortuneService;

public class DisposableBeanTrackCoach implements Coach,DisposableBean {

//	DisposableBean to call destroy method from application context file
	
	private FortuneService fortuneService;

	public DisposableBeanTrackCoach() {
		System.out.println("DisposableBeanTrackCoach: No arg Constructor");
	}

	public DisposableBeanTrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void doMyStartUpStuff() {
		System.out.println("DisposableBeanTrackCoach: doMyStartUpStuff");
	}

	public void doMyCleanUpStuff() {
		System.out.println("DisposableBeanTrackCoach: doMyCleanUpStuff");
	}

	@Override
	public String getDailyWorkout() {
		return "DisposableBeanTrackCoach: Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "DisposableBeanTrackCoach: Just Do It: " + fortuneService.getFortune();
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBeanTrackCoach: destroy = > doMyCleanUpStuff");
		doMyCleanUpStuff();
	}
	
}










