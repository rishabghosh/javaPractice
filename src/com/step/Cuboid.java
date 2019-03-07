package com.step;

public class Cuboid extends Rectangle {
  private double height;

  public Cuboid(double length, double width, double height) {
    super(length, width);
    this.height = height;
    if (height < 0) this.height = 0;
  }

  public double getHeight() {
    return height;
  }

  public double getVolume() {
    double area = getArea();
    return area * height;
  }
}
