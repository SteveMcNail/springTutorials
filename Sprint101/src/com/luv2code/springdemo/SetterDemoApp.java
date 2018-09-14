package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

  public static void main(String[] args) {
    // load spring-config
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve spring bean
    Coach theCoach = context.getBean("myCoach", Coach.class);
    Coach anotherCoach = context.getBean("myCoach", Coach.class);



    // call bean-methods
    System.out.println("Listen kid, my fortune-advise today is '" +theCoach.getDailyFortune() + "'");
    System.out.println("And now do your work! " + theCoach.getDailyWorkout());

    System.out.println("You can email your whiney complaints to my email adress " + theCoach.getEmailAddress());
    System.out.println("If you pull through, you maybe worthy of our team, the " + theCoach.getTeam());

    // close context
    context.close();
  }
}
