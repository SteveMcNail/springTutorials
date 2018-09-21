package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EventingCoach implements Coach {


  @Autowired
  @Qualifier("RESTFortuneSerivce")
  private FortuneService fortuneService;

  @Override
  public String getDailyWorkout() {
    return "Jump these coffins three times!";
  }

  @Override
  public String getDailyFortune() {
    return null;
  }
}
