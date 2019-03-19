package com.tw.codesmell.method;

public class Order {

  private int basePrice;

  public Order(int basePrice) {
    this.basePrice = basePrice;
  }

  double basePrice() {
    return basePrice;
  }
}