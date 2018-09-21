package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.*;

@Component
public class RandomFortunePropertyService implements FortuneService {

  private List<String> fortunes = new ArrayList<>();
  private Random randomNumberGenerator = new Random();

  public RandomFortunePropertyService() {

    InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("fortunes.properties");

    try {

      System.out.println("InputStream-available: " + inputStream.available());

      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

      String tempReadLine;

      while (Objects.nonNull(tempReadLine = bufferedReader.readLine())) {
        fortunes.add(tempReadLine);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public String getFortune() {

    return fortunes.get(randomNumberGenerator.nextInt(fortunes.size()));

  }
}
