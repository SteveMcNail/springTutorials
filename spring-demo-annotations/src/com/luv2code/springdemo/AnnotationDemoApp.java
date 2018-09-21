package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

  public static void main(String[] args) {
    // read spring config file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    // retrieve bean from sprint container
    Coach theTennisCoach = context.getBean("tennisCoach", Coach.class);
    Coach theEventingCoach = context.getBean("eventingCoach", Coach.class);
    Coach theSwimCoach = context.getBean("swimCoach", Coach.class);
    // do something
    System.out.println("\nThe tennis coach mumbles " + theTennisCoach.getDailyWorkout());
    System.out.println("\nThe tennis coach looks into his crystall ball and proclaims '" + theTennisCoach.getDailyFortune() + "'");

    System.out.println("\nThe swim coach yells " + theSwimCoach.getDailyWorkout());

//    System.out.println("\nThe eventing coach hollers " + theEventingCoach.getDailyWorkout());
//    System.out.println("\ndaily fortune of the tennis coach: " + theTennisCoach.getDailyFortune());
//     close context
    context.close();
  }
}
