package com.tw.codesmell.move;

public class Car {

  private String brand;
  private String type;
  private double price;

  public Car(String brand, String type, double price) {
    this.brand = brand;
    this.type = type;
    this.price = price;
  }

  public String getBrand() {
    return brand;
  }

  public String getType() {
    return type;
  }

  public double getPrice() {
    return price;
  }

}
