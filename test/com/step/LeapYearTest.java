package com.step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

  @Test
  void isLeapYear_10000(){
    assertFalse(LeapYear.isLeapYear(10000));
  }

  @Test
  void isLeapYear__minus_1600() {
    assertFalse(LeapYear.isLeapYear(-1600));
  }

  @Test
  void isLeapYear_1600(){
    assertTrue(LeapYear.isLeapYear(1600));
  }

  @Test
  void isLeapYear_2017(){
    assertFalse(LeapYear.isLeapYear(2017));
  }

  @Test
  void isLeapYear_2000(){
    assertTrue(LeapYear.isLeapYear(2000));
  }
}