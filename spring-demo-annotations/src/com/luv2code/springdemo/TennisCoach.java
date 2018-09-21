package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

  private FortuneService fortuneService;

  @Autowired
  public TennisCoach(@Qualifier("randomFortuneService")FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  public TennisCoach() {
    System.out.println("\n>> TennisCoach default constructor");
  }


  // define init method
  @PostConstruct
  public void doMyStartupStuff() {
    System.out.println(">> TennisCoach: is doing some startup-stuff, like polishing the tennis balls");
  }

  // define destroy method
  @PreDestroy
  public void doMyCleanupStuff() {
    System.out.println(">> TennisCoach: is doing some cleanup-stuff, like raking the sand");
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
