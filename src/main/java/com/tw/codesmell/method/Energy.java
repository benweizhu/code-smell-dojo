package com.tw.codesmell.method;

public class Energy {
  double potentialEnergy(double mass, double height) {
    // 9.81 is gravitational constant
    return mass * height * 9.81;
  }
}
