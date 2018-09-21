package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.*;
import java.util.*;

@Component
public class RandomFortunePropertyService implements FortuneService {

  private List<String> fortunes = new ArrayList<>();
  private Random randomNumberGenerator = new Random();

  public RandomFortunePropertyService() {
    System.out.println(">> constructor called");
  }

  // read the fortunes from the file in after bean-construct
  @PostConstruct
  public void initFortunes() {
    InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("fortunes.properties");
    System.out.println(">> initFortunes - reading the property-file");
    try {

      System.out.println("InputStream-available: " + inputStream.available());

      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

      String tempReadLine;

      while (Objects.nonNull(tempReadLine = bufferedReader.readLine())) {
        fortunes.add(tempReadLine);
        System.out.println(">> initFortunes - reading lines");
      }

      inputStream.close();

    } catch (IOException e) {
      System.out.println(">> initFortunes - Error reading property-file!");
      e.printStackTrace();
    }
  }

  @PreDestroy
  public void cleanUp() {
    System.out.println(">> cleaning up!");
  }


  @Override
  public String getFortune() {

    return fortunes.get(randomNumberGenerator.nextInt(fortunes.size()));

  }
}
