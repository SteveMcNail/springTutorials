package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {


  private FortuneService fortuneService;

  @Autowired
  public VolleyballCoach(@Qualifier("RESTFortuneSerivce") FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Just get it over the net ... 30 times!";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}
