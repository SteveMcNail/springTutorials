package com.luv2code.springdemo;

public class WalkingCoach implements Coach {

  private FortuneService fortuneService;

  public WalkingCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Walk 20km, starting NOW! Shooo!";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}
