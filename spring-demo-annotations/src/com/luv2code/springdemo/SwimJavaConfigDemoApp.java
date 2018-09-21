package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

  public static void main(String[] args) {
    // read spring configuration class
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

    // retrieve bean from sprint container
    Coach theTennisCoach = context.getBean("swimCoach", Coach.class);

    // do something
    System.out.println("\nThe tennis coach mumbles " + theTennisCoach.getDailyWorkout());
    System.out.println("\nThe tennis coach looks into his crystall ball and proclaims '" + theTennisCoach.getDailyFortune() + "'");

    // close context
    context.close();
  }
}
