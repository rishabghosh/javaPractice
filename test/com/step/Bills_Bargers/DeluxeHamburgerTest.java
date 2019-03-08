package com.step.Bills_Bargers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeluxeHamburgerTest {

  @Test
  void getTotalPrice1() {
    DeluxeHamburger deluxeHamburger = new DeluxeHamburger(50.0, true, true);
    double actual = deluxeHamburger.getTotalPrice();
    assertEquals(160.0, actual);
  }

  @Test
  void getTotalPrice2() {
    DeluxeHamburger deluxeHamburger = new DeluxeHamburger(50.0, true, false);
    double actual = deluxeHamburger.getTotalPrice();
    assertEquals(110.0, actual);
  }

  @Test
  void getName1() {
    DeluxeHamburger deluxeHamburger = new DeluxeHamburger(50.0, true, true);
    String actual = deluxeHamburger.getName();
    assertEquals("Deluxe Bread With Meat", actual);
  }
}