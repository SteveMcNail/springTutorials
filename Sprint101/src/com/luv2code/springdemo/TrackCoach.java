package com.luv2code.springdemo;

public class TrackCoach implements Coach {

  private String emailAddress;
  private String team;

  public TrackCoach(HappyFortuneService happyFortuneService) {
  }

  public TrackCoach() {
  }

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

  // add an init method
  public void doMyStartupStuff() {
    System.out.println("TrackCoach: Inside the startup/init method");
  }

  // add a destroy method
  public void doMyCleanupStuff() {
    System.out.println("TrackCoach: Inside the destroy method");
  }
}

