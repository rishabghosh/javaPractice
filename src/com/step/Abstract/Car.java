package com.step.Abstract;

public class Car extends Vehicle {

  @Override
  public void accelerator() {
    super.speed += 2;
  }
  
}
