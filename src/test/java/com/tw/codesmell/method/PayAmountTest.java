package com.tw.codesmell.method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayAmountTest {
  @Test
  void should_return_0_when_get_pay_amount_given_is_dead() {
    PayAmount payAmount = new PayAmount(true, false, false);
    assertEquals(0, payAmount.getPayAmount());
  }
}