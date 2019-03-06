package com.step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

  @Test
  void area_with_arg_radius_valid() {
    double actual =  AreaCalculator.area(5.0);
    assertEquals(78.53975, actual, 0.0001);
  }

  @Test
  void area_with_arg_radius_invalid() {
    double actual =  AreaCalculator.area(-1);
    assertEquals(-1, actual);
  }

  @Test
  void area_with_arg_x_and_y_valid(){
    double actual = AreaCalculator.area(5.0, 4.0);
    assertEquals(20.0, actual);
  }

  @Test
  void area_with_arg_x_and_y_invalid(){
    double actual = AreaCalculator.area(-1.0, 4.0);
    assertEquals(-1, actual);
  }
}