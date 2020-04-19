package com.ds.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ds.inversionofcontrol.Coach;

@Component
public class AutowiredTennisCoach implements AnnotationCoach {
	
//	Field Injection
	@Autowired
	AnnotationFortuneService annotationFortuneService;
	
	@Autowired
	@Qualifier("multiFortuneService")
	FortuneService fortuneService;

	public AutowiredTennisCoach() {
		System.out.println("AutowiredTennisCoach : no Arg constructor");
	}
	
	//setter Injection
	@Autowired
	public void setAnnotationFortuneService(AnnotationFortuneService thFortuneService) {
		this.annotationFortuneService = thFortuneService;
		System.out.println("setAnnotationFortuneService");
	}

//	Name of method dosenot matter for autowired
	@Autowired
	public void doSomeCrazyStuff(AnnotationFortuneService thFortuneService) {
		this.annotationFortuneService = thFortuneService;
		System.out.println("doSomeCrazyStuff");
	}

	
	@Override
	public String getDailyWorkout() {
		return "AutowiredTennisCoach: Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return annotationFortuneService.getFortune();
	}

}
