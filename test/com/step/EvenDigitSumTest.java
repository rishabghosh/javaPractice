package com.step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenDigitSumTest {

  @Test
  void getEvenDigitSum_1() {
    int actual = EvenDigitSum.getEvenDigitSum(123456789);
    assertEquals(20, actual);
  }

  @Test
  void getEvenDigitSum_2() {
    int actual = EvenDigitSum.getEvenDigitSum(252);
    assertEquals(4, actual);
  }

  @Test
  void getEvenDigitSum_3() {
    int actual = EvenDigitSum.getEvenDigitSum(-22);
    assertEquals(-1, actual);
  }
}