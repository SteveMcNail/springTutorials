package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sports.properties")
public class SportConfig {

  // define bean for our sad fortune service
  // method is the actual bean name, registed by the container
  @Bean
  public FortuneService sadFortuneService() {
    return new SadFortuneService();
  }

  // define bean for our swim coach AND inject dependency of the sadFortuneService above
  @Bean
  public SwimCoach swimCoach() {
    return new SwimCoach(sadFortuneService());
  }

}
