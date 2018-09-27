package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Member;

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

  // new ctrol method to read form data and add to model


  @RequestMapping("/processFormTwo")
  public String shoutDude (HttpServletRequest request, Model model) {

    // read request param from form
    String studentName = request.getParameter("studentName");

    // convert to upper case
    studentName = studentName.toUpperCase();

    // create the message
    String result = "Yo!  ! " + studentName;

    // add message to code
    model.addAttribute("message", result);
    
    return "helloworld";
  }
}
