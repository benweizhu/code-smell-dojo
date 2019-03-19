package com.tw.codesmell.method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaDeliveryTest {
  @Test
  void should_return_2_when_get_rating_given_number_of_late_deliveries_is_more_than_5() {
    PizzaDelivery pizzaDelivery = new PizzaDelivery(6);
    assertEquals(2, pizzaDelivery.getRating());
  }
}