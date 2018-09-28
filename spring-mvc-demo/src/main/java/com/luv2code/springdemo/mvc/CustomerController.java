package com.luv2code.springdemo.mvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

  // add an initBinder  .. to convert or trim input strings
  // remove leading and trialing whitespaces or trim to null
  @InitBinder
  public void initBinder(WebDataBinder webDataBinder) {
    StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

    webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
  }


  @RequestMapping("/showForm")
  public String showForm(Model theModel) {
    theModel.addAttribute("customer", new Customer());

    return "customer-form";
  }

  @RequestMapping("/processForm")
  public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult result) {


    if (result.hasErrors()) {
      System.out.println("BindingResult: " + result);
      System.out.println("\n\n\n\n\n\n\n");
      return "customer-form";
    } else {
      return "customer-confirmation";
    }
  }

}
