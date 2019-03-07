package com.step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLastDigitSumTest {


  @Test
  void sumFirstAndLastDigit1() {
    int actual = FirstLastDigitSum.sumFirstAndLastDigit(252);
    assertEquals(4, actual);
  }

  @Test
  void sumFirstAndLastDigit2() {
    int actual = FirstLastDigitSum.sumFirstAndLastDigit(257);
    assertEquals(9, actual);
  }

  @Test
  void sumFirstAndLastDigit3() {
    int actual = FirstLastDigitSum.sumFirstAndLastDigit(0);
    assertEquals(0, actual);
  }

  @Test
  void sumFirstAndLastDigit4() {
    int actual = FirstLastDigitSum.sumFirstAndLastDigit(5);
    assertEquals(10, actual);
  }

  @Test
  void sumFirstAndLastDigit5() {
    int actual = FirstLastDigitSum.sumFirstAndLastDigit(-10);
    assertEquals(-1, actual);
  }
}