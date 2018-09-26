package de.naegele.stephan.katas.spring.configuration.java.exampleSolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

  private FortuneService fortuneService;

  @Autowired
  public TennisCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Spin some volleys, 60 minutes";
  }

  @Override
  public String getFortune() {
    return fortuneService.getFortune();
  }
}
