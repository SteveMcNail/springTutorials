package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

  //define a private filed for the dependency
  private FortuneService fortuneService;

  private String emailAddress;
  private String team;

  // define a constructor for dependency injection
  public BaseballCoach(FortuneService theFortuneService) {
    this.fortuneService = theFortuneService;
  }

  public BaseballCoach() {
  }

  @Override
  public String getDailyWorkout() {
    return "Spend 30 minutes on batting practice";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

  @Override
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  @Override
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }
}
