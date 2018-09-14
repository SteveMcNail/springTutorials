package com.luv2code.springdemo;

import javafx.util.Builder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

  public static void main (String[] args) {

    // load spring configuration file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle_applicationContext.xml");

    // retrieve bean from context
    Coach myCoach = context.getBean("myCoach", Coach.class);

    System.out.println(myCoach.getDailyWorkout());

    // close context
    context.close();

  }
}
