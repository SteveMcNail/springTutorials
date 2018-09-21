package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WalkingConfig {

  @Bean
  public SilentFortuneService silentFortuneService() {
    return new SilentFortuneService();
  }

  @Bean
  public WalkingCoach walkingCoach() {
    return new WalkingCoach(silentFortuneService());
  }

}
