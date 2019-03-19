package com.tw.codesmell.method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {
  @Test
  void should_return_true_when_check_has_discount_given_base_price_is_2000() {
    Discount discount = new Discount();
    assertTrue(discount.hasDiscount(new Order(2000)));
  }

  @Test
  void should_return_48_when_discount_when_get_discount_give_input_is_50_quantity_is_1() {
    Discount discount = new Discount();
    assertEquals(48, discount.discount(50, 1));
  }
}