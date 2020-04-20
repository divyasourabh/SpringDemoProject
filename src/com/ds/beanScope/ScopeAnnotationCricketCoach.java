package com.ds.beanScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@Scope("prototype")
public class ScopeAnnotationCricketCoach implements ScopeCoach{
	
	@Autowired
	@Qualifier("beanAnnotationScopeFortuneService")
	FortuneService fortuneService;
	
	public ScopeAnnotationCricketCoach() {
		System.out.println("ScopeAnnotationCricketCoach : no Arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 5Km everyDay";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("ScopeAnnotationCricketCoach: @PostContruct doMyStartUpStuff");
	}

	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("ScopeAnnotationCricketCoach: @PreDestroy doMyCleanUpStuff");
	}


}
