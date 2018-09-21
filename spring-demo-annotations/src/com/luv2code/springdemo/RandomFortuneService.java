package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

  // Create an array of Strings
  private String[] data = {
    "Beware of the wolf in sheeps clothing",
    "Diligence is the mother of good luck",
    "the journey is the reward"
  };

  // create an random number generator
  private Random myRandomGenerator = new Random();

  @Override
  public String getFortune() {
    // pick random string from array
    return data[myRandomGenerator.nextInt(data.length)];
  }
}
