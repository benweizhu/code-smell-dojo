package com.tw.codesmell.method;

public class Discount {

  boolean hasDiscount(Order order) {
    double basePrice = order.basePrice();
    return basePrice > 1000;
  }

  int discount(int inputVal, int quantity) {
    if (inputVal > 50) {
      inputVal -= 2;
    }
    return inputVal * quantity;
  }

  private class Order {
    double basePrice() {
      return 0;
    }
  }

}
