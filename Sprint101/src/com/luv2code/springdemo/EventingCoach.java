package com.luv2code.springdemo;

import java.util.Random;

public class EventingCoach implements Coach {

  private FortuneService fortuneService;
  private String emailAddress;
  private String team;

  public EventingCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  public EventingCoach() {
  }

  @Override
  public String getDailyWorkout() {
    return "jump that coffin 3 times without breaking your neck!!";
  }

  @Override
  public String getDailyFortune() {
    return "just do it!";
  }

  @Override
  public String getEmailAddress() {
    return emailAddress;
  }

  @Override
  public String getTeam() {
    return team;
  }

  public void setFortuneService(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public void setTeam(String team) {
    this.team = team;
  }
}
