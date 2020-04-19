package com.ds.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ds.inversionofcontrol.Coach;

@Component
public class AutowiredTennisCoach implements AnnotationCoach {
	
	AnnotationFortuneService annotationFortuneService;
	
	public AutowiredTennisCoach() {
		System.out.println("AutowiredTennisCoach : no Arg constructor");
	}
	
	@Autowired
	public void setAnnotationFortuneService(AnnotationFortuneService thFortuneService) {
		this.annotationFortuneService = thFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "TennisCoach: Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return annotationFortuneService.getFortune();
	}

}
