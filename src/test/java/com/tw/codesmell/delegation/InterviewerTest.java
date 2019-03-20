package com.tw.codesmell.delegation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterviewerTest {

  @Test
  void should_return_manager_when_ask_for_manager_given_manager_exist() {
    Interviewer interviewer = new Interviewer();
    Person person = new Person(new Department(new Manager()));
    Manager manager = interviewer.askForManager(person);
    assertNotNull(manager);
  }

}