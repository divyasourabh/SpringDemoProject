package com.ds.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AutowiredTennisCoach implements AnnotationCoach {

	@Value("${foo.email}")
	private String email;

	@Value("${team}")
	private String team;

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
		System.out.println("Email: " + email);
		System.out.println("Team: " + team);
		return "AutowiredTennisCoach: Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return annotationFortuneService.getFortune();
	}

}
