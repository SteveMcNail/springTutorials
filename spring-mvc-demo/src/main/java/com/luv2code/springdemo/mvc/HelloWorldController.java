package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

  // show inital form with controller method


  @RequestMapping("/showForm")
  public String showForm() {
    return "helloworld-form";
  }

  // prozess form with controller method

  @RequestMapping("/processForm")
  public String processForm() {
    return "helloworld";
  }
}
