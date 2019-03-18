package com.tw.codesmell.conditional;

class Bird {

  private double numberOfCoconuts;
  private boolean isNailed;
  private BirdType type;

  public Bird(double numberOfCoconuts, boolean isNailed, BirdType type) {
    this.numberOfCoconuts = numberOfCoconuts;
    this.isNailed = isNailed;
    this.type = type;
  }

  double getSpeed() {
    switch (type) {
      case EUROPEAN:
        return getBaseSpeed();
      case AFRICAN:
        return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
      case NORWEGIAN_BLUE:
        return (isNailed) ? 0 : getBaseSpeed();
    }
    throw new RuntimeException("Should be unreachable");
  }

  private double getLoadFactor() {
    return 2;
  }

  private double getBaseSpeed() {
    return 10;
  }
}