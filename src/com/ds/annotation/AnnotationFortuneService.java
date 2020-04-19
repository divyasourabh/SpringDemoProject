package com.ds.annotation;

import org.springframework.stereotype.Component;

@Component
public class AnnotationFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "AnnotationFortuneService: Today is your lucky day!";
	}

}