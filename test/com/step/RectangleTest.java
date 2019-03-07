package com.step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

  @Test
  void getLength1() {
    Rectangle rectangle = new Rectangle(5, 10);
    assertEquals(10.0, rectangle.getLength());
  }

  @Test
  void getWidth1() {
    Rectangle rectangle = new Rectangle(5, 10);
    assertEquals(5.0, rectangle.getWidth());
  }

  @Test
  void getArea1() {
    Rectangle rectangle = new Rectangle(5, 10);
    assertEquals(50.0, rectangle.getArea());
  }
}