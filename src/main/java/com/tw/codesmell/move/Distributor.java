package com.tw.codesmell.move;

import java.util.List;

import static java.lang.String.format;

public class Distributor {

  private static final String MAZDA_INTRODUCE_FORMAT = "This is %s under %s, the price is %f.";
  private static final String HONDA_INTRODUCE_FORMAT = "This is %s under %s, the price is %f.";
  private static final String INTRODUCE_FORMAT = "This is %s under %s, the price is %f.";

  private List<Car> cars;

  public Distributor(List<Car> cars) {
    this.cars = cars;
  }

  public String introduce(Car car) {
    if (car instanceof Mazda) {
      return format(MAZDA_INTRODUCE_FORMAT, car.getType(), car.getBrand(), car.getPrice());
    }

    if (car instanceof Honda) {
      return format(HONDA_INTRODUCE_FORMAT, car.getType(), car.getBrand(), car.getPrice());
    }

    return format(INTRODUCE_FORMAT, car.getType(), car.getBrand(), car.getPrice());
  }
}
