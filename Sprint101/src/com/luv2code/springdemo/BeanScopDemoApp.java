package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopDemoApp {

  public static void main (String[] args) {

    // load spring configuration file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope_applicationContext.xml");

    // retrieve bean from context
    Coach theCoach = context.getBean("myCoach", Coach.class);
    Coach alphaCoach = context.getBean("myCoach", Coach.class);

    System.out.println("\n" + theCoach.equals(alphaCoach));
    System.out.println("\nMemoryid theCoach: " + theCoach);
    System.out.println("\nMemoryid alphaCoach: " + alphaCoach);

    context.close();
  }
}
