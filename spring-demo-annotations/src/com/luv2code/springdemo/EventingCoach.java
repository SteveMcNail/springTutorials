package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class EventingCoach implements Coach {
  @Override
  public String getDailyWorkout() {
    return "Jump these coffins three times!";
  }
}
