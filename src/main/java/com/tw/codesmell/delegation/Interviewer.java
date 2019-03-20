package com.tw.codesmell.delegation;

public class Interviewer {

  public Manager askForManager(Person person){
    return person.getDepartment().getManager();
  }

}
