package com.tw.codesmell.method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnergyTest {
  @Test
  void should_return_981_when_get_potential_energy_given_mass_is_10_and_height_10() {
    Energy energy = new Energy();
    assertEquals(981, energy.potentialEnergy(10, 10));
  }
}