package com.tw.codesmell.method;

public class Employee {

  private int type;
  private int salary;

  public Employee(int type) {
    this.type = type;
    if (this.type == 1) {
      this.salary = 100;
    }
    if (this.type == 2) {
      this.salary = 200;
    }
    if (this.type == 3) {
      this.salary = 300;
    }
  }

}
