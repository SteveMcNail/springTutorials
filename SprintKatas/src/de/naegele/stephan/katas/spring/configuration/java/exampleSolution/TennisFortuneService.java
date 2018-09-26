package de.naegele.stephan.katas.spring.configuration.java.exampleSolution;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class TennisFortuneService implements FortuneService {
  @Override
  public String getFortune() {
    return "A Apple a day keeps the doctor away!";
  }
}
