package de.naegele.stephan.katas.spring.configuration.annotations.exampleSolution;

import de.naegele.stephan.katas.spring.configuration.java.exampleSolution.Coach;
import de.naegele.stephan.katas.spring.configuration.java.exampleSolution.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationConfigurationMain {

  public  static final void main (String[] args) {

    // TODO: Schreibe eine FortuneService-Implementierung (TennisFortuneService), die hardcoded eine "Weisheit" ausgibt.
    // TODO: Implementiere den Coach aus, so dass er einen hardcoded Workout ausgibt, die neue FortuneServiceImplementierung verwendet und deren Ausgabe verwendet
    // TODO: Erstelle eine Spring-Konfiguration (SportConfig) mit Java Annotations und wende Inversion of Controll und Dependency Injection auf die entsprechenden Klassen an.
    // TODO: Implementiere die MainKlasse aus und verwende die entsprechenden Klassen/gebe via System.out.println die Anweisungen/Weisheiten aus.
    // TODO: Teste Deine Implementierung

    // read spring configuration class
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("de/naegele/stephan/katas/spring/configuration/annotations/exampleSolution/applicationContext.xml");

    // get the bean from the context
    de.naegele.stephan.katas.spring.configuration.java.exampleSolution.Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

    // call a method on the bean
    System.out.println("The Coach yells: " + tennisCoach.getDailyWorkout());

    // call the fortuneService on the bean
    System.out.println("\nthen he mumbles: " + tennisCoach.getFortune());

    // close the context
    context.close();
  }
}
