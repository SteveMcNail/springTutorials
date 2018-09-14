package com.luv2code.springdemo;

public class EventingCoach implements Coach {

  private FortuneService fortuneService;

  public EventingCoach(HappyFortuneService happyFortuneService) {
    fortuneService = happyFortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "jump that coffin 3 times without breaking your neck!!";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}
