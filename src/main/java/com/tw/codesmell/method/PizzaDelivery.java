package com.tw.codesmell.method;

class PizzaDelivery {

  private int numberOfLateDeliveries;

  public PizzaDelivery(int numberOfLateDeliveries) {
    this.numberOfLateDeliveries = numberOfLateDeliveries;
  }

  int getRating() {
    return moreThanFiveLateDeliveries() ? 2 : 1;
  }

  boolean moreThanFiveLateDeliveries() {
    return numberOfLateDeliveries > 5;
  }
}