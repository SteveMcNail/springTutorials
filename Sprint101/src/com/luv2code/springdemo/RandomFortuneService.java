package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

  private final List<String> fortuneList = Arrays.asList("Just do it!","Get'em tiger!", "start slow, finish fast!", "shut up and run!");

  @Override
  public String getFortune() {
    return fortuneList.get(new Random().nextInt(fortuneList.size()));
  }
}
