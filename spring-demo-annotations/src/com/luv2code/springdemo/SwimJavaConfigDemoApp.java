package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

  public static void main(String[] args) {
    // read spring configuration class
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

    // retrieve bean from sprint container
    SwimCoach theSwimmCoach = context.getBean("swimCoach", SwimCoach.class);

    // do something
    System.out.println("\nThe tennis coach mumbles " + theSwimmCoach.getDailyWorkout());
    System.out.println("\nThe tennis coach looks into his crystall ball and proclaims '" + theSwimmCoach.getDailyFortune() + "'");
    System.out.println("\nhe shouts my email is " + theSwimmCoach.getEmail());
    System.out.println("\nand my team is " + theSwimmCoach.getTeam());

    // close context
    context.close();
  }
}
