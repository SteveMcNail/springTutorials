package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

  private FortuneService fortuneService;

  @Autowired
  public TennisCoach(@Qualifier("randomFortuneService")FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  public TennisCoach() {
    System.out.println("\n>> TennisCoach default constructor");
  }

  @Override
  public String getDailyWorkout() {
    return "Practise your backhand volley!";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

}
