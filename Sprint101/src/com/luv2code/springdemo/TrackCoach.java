package com.luv2code.springdemo;

public class TrackCoach implements Coach {

  private String emailAddress;
  private String team;
  
  @Override
  public String getDailyWorkout() {
    return "Run a hard 5k";
  }

  @Override
  public String getDailyFortune() {
    return "just use the force!";
  }

  @Override
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  @Override
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }
}
