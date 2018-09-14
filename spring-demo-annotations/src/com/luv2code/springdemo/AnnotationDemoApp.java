package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

  public static void main(String[] args) {
    // read spring config file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    // retrieve bean from sprint container
    Coach theTennisCoach = context.getBean("tennisCoach", Coach.class);
    Coach theEventingCoach = context.getBean("eventingCoach", Coach.class);
    // do something
    System.out.println("\nThe tennis coach mumbles " + theTennisCoach.getDailyWorkout());
    System.out.println("\nThe eventing coach hollers " + theEventingCoach.getDailyWorkout());

    // close context
    context.close();
  }
}
