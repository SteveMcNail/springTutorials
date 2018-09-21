package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

  public static final void main(String[] args) {

    // load spring config file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve bean from container
    Coach theCoach = context.getBean("tennisCoach", Coach.class);

    Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

    // check if they are the same
    boolean result = (theCoach == alphaCoach);

    System.out.println("\nPointing to the same object? " + result);
    System.out.println("\nMomory location for theCoach " +  theCoach);
    System.out.println("\nMomory location for alphaCoach " +  alphaCoach);

    // close context
    context.close();

  }
}
