package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

  private String firstName;
  private String lastName;
  private String country;

  private LinkedHashMap<String, String> countryOptions;

  public Student() {
    // populate countryOptions

    countryOptions = new LinkedHashMap<>();

    countryOptions.put("DE", "Germany");
    countryOptions.put("BR", "Brasil");
    countryOptions.put("FR", "France");
    countryOptions.put("UK", "UK");
    countryOptions.put("IN", "India");
  }

  public Student(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public LinkedHashMap<String, String> getCountryOptions() {
    return countryOptions;
  }
}