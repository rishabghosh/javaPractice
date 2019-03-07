package com.step;

public class Vehicle {
  private int speed;

  public Vehicle() {
  }

  public void increaseSpeed(int speed){
    this.speed += speed;
  }

  public void decreaseSpeed(int speed){
    this.speed -= speed;
    if(this.speed < 0 ) this.speed = 0;
  }
}
