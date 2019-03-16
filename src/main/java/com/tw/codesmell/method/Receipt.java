package com.tw.codesmell.method;

public class Receipt {

  private String name;

  public Receipt(String name) {
    this.name = name;
  }

  void print() {
    printBanner();

    // Print details.
    System.out.println("name: " + name);
    System.out.println("amount: " + getOutstanding());
  }

  private void printBanner() {
    System.out.println("banner: Receipt");
  }

  private String getOutstanding() {
    return null;
  }

}
