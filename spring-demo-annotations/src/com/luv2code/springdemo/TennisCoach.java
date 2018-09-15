package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

  @Autowired
  private FortuneService fortuneService;

 /* @Autowired
  public TennisCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }
*/

  public TennisCoach() {
    System.out.println("\n>> TennisCoach default constructor");
  }

 /* @Autowired
  public void setFortuneService(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }*/

  @Override
  public String getDailyWorkout() {
    return "Practise your backhand volley!";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

}
