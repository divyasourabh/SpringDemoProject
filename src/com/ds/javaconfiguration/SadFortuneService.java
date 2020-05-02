package com.ds.javaconfiguration;

public class SadFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "It is a SAD Day";
	}

}
