package com.tw.codesmell.method;

public class Discount {

  boolean hasDiscount(Order order) {
    double basePrice = order.basePrice();
    return basePrice > 1000;
  }

  int discount(int inputVal, int quantity) {
    if (inputVal > 49) {
      inputVal -= 2;
    }
    return inputVal * quantity;
  }

}
