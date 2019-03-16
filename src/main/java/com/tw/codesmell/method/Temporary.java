package com.tw.codesmell.method;

public class Temporary {

  void calculate(int height, int width) {
    double temp = 2 * (height + width);
    System.out.println(temp);
    temp = height * width;
    System.out.println(temp);
  }

}
