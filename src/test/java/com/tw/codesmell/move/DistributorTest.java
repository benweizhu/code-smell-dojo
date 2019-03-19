package com.tw.codesmell.move;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistributorTest {

  @Test
  void should_return_mazda_introduction_when_introduce_given_car_is_mazda() {
    Car car = new Car("Mazda", "suv", 200000);
    Distributor distributor = new Distributor();
    assertEquals("This is suv under Mazda, the price is 200000.0.", distributor.introduce(car));
  }

  @Test
  void should_return_honda_introduction_when_introduce_given_car_is_honda() {
    Car car = new Car("Honda", "suv", 200000);
    Distributor distributor = new Distributor();
    assertEquals("This is suv under Honda, the price is 200000.0.", distributor.introduce(car));
  }

}