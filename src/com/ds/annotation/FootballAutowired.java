package com.ds.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballAutowired implements AnnotationCoach{
	
	AnnotationFortuneService annotationFortuneService;
	
	@Autowired
	public FootballAutowired(AnnotationFortuneService thFortuneService) {
		this.annotationFortuneService = thFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "AnnotationFortuneService: Daily Run 5KM";
	}

	@Override
	public String getDailyFortune() {
		return annotationFortuneService.getFortune();
	}

}
