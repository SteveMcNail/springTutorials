package de.naegele.stephan.katas.spring.configuration.annotations.exampleSolution;

import de.naegele.stephan.katas.spring.configuration.java.exampleSolution.Coach;
import de.naegele.stephan.katas.spring.configuration.java.exampleSolution.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
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
