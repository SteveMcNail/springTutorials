package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

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
    return null;
  }
}
