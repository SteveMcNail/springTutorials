package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopDemoApp {

  public static void main(String[] args) {

    // load spring application configuration
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope_applicationContext.xml");

    // retrieve bean from application context
    Coach theCoach = context.getBean("myCoach", Coach.class);
    Coach alphaCoach = context.getBean("myCoach", Coach.class);

    // do something with the bean
    System.out.println("\n" + theCoach.equals(alphaCoach));
    System.out.println("\nMemoryid theCoach: " + theCoach);
    System.out.println("\nMemoryid alphaCoach: " + alphaCoach);

    // close application context
    context.close();
  }
}
