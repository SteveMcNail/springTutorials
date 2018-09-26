package de.naegele.stephan.katas.spring.configuration.java.exampleSolution;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "de.naegele.stephan.katas.spring.configuration.java.exampleSolution")
public class SportConfig {

  // Define the Bean for the tennisFortuneService
  @Bean
  public FortuneService tennisFortuneService () {
    return new TennisFortuneService();
  }

  // Define Bean for the TennisCoach and inject tennisFortuneService
  @Bean
  public TennisCoach tennisCoach() {
    return new TennisCoach(tennisFortuneService());
  }

}
