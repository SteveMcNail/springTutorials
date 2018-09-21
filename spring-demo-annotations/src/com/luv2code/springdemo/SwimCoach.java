package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

  private FortuneService fortuneService;

  @Autowired
  public SwimCoach(@Qualifier("randomFortunePropertyService") FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Value("${foo.email}")
  private String email;

  @Value("${foo.team}")
  private String team;

  @Override
  public String getDailyWorkout() {
    return "Swim 10 lanes and then email me under " + email + ", if you want to be member of the team " + team;
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}
