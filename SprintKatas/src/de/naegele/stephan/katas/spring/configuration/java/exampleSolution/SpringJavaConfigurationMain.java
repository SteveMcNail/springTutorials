package de.naegele.stephan.katas.spring.configuration.java.exampleSolution;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJavaConfigurationMain {

  public  static final void main (String[] args) {

    // TODO: Schreibe eine FortuneService-Implementierung (TennisFortuneService), die hardcoded eine "Weisheit" ausgibt.
    // TODO: Implementiere den Coach aus, so dass er einen hardcoded Workout ausgibt, die neue FortuneServiceImplementierung verwendet und deren Ausgabe verwendet
    // TODO: Erstelle eine Spring-Konfiguration  (SportConfig) via Java und wende Inversion of Controll und Dependency Injection auf die entsprechenden Klassen an.
    // TODO: Implementiere die MainKlasse aus und verwende die entsprechenden Klassen/gebe via System.out.println die Anweisungen/Weisheiten aus.
    // TODO: Test your implementation

    // read spring configuration class
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

    // get the bean from the context
    Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

    // call a method on the bean
    System.out.println("The Coach yells: " + tennisCoach.getDailyWorkout());

    // call the fortuneService on the bean
    System.out.println("\nthen he mumbles: " + tennisCoach.getFortune());

    // close the context
    context.close();
  }
}
