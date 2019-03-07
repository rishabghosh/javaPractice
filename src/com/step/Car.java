package com.step;

public class Car extends Vehicle {
  private boolean steering;
  private int gear;

  public Car() {
    super();
    this.steering = true;
  }

  public void increaseGear(int speedToIncrease) {
    this.gear += 1;
    increaseSpeed(speedToIncrease);
  }

  public void decreaseGear(int speedToDecrease) {
    if (this.gear < 0) return;
    this.gear -= 1;
    decreaseSpeed(speedToDecrease);
  }
}
