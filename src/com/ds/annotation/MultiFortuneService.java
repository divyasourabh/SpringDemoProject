package com.ds.annotation;

import org.springframework.stereotype.Component;

@Component
public class MultiFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "MultiFortuneService	: Today is your lucky day!";
	}
}
