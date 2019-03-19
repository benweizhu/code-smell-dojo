package com.tw.codesmell.method;

public class PayAmount {

  private boolean isDead;
  private boolean isSeparated;
  private boolean isRetired;

  public PayAmount(boolean isDead, boolean isSeparated, boolean isRetired) {
    this.isDead = isDead;
    this.isSeparated = isSeparated;
    this.isRetired = isRetired;
  }

  public double getPayAmount() {
    double result;
    if (isDead){
      result = deadAmount();
    }
    else {
      if (isSeparated){
        result = separatedAmount();
      }
      else {
        if (isRetired){
          result = retiredAmount();
        }
        else{
          result = normalPayAmount();
        }
      }
    }
    return result;
  }

  private double normalPayAmount() {
    return 100;
  }

  private double retiredAmount() {
    return 30;
  }

  private double separatedAmount() {
    return 10;
  }

  private double deadAmount() {
    return 0;
  }
}
