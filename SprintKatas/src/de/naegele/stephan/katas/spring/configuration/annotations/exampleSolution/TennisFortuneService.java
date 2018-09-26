package de.naegele.stephan.katas.spring.configuration.annotations.exampleSolution;

import de.naegele.stephan.katas.spring.configuration.java.exampleSolution.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class TennisFortuneService implements FortuneService {
  @Override
  public String getFortune() {
    return "A Apple a day keeps the doctor away!";
  }
}
