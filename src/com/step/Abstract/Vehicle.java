package com.step.Abstract;

public abstract class Vehicle {
  protected int speed;

  public void stop(){
    this.speed = 0;
  }

  public abstract void accelerator();
}
