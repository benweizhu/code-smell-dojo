package com.tw.codesmell.composite;

public class Computer implements Cpu, HardDrive, Memory {

  @Override
  public void run() {
    System.out.println("CPU run");
  }

  @Override
  public void restore() {
    System.out.println("Hard drive restore");
  }

  @Override
  public void flush() {
    System.out.println("Memory flush");
  }
}
