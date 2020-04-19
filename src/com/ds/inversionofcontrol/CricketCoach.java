package com.ds.inversionofcontrol;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	//add new field for emailAddress and team
	private String emailAddress;
	private String team;


	public CricketCoach() {
		System.out.println("CricketCoach: Inside no arg constructor");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside Setter Method : setEmailAdddress");
		this.emailAddress = emailAddress;
	}
	
	public String getTeam() {
		return team;
	}
	
	public void setteam(String team) {
		this.team = team;
	}
	
	public void setFortuneService (FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method; setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
