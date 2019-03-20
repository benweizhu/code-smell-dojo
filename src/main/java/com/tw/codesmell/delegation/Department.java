package com.tw.codesmell.delegation;

public class Department {
  private Manager manager;

  public Department(Manager manager) {
    this.manager = manager;
  }

  public Manager getManager() {
    return manager;
  }
}
