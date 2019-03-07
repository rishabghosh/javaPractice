package com.step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharedDigitTest {

  @Test
  void hasSharedDigit_for_args_having_shared_digit_1() {
    assertTrue(SharedDigit.hasSharedDigit(12, 23));
  }

  @Test
  void hasSharedDigit_for_number_not_within_range() {
    assertFalse(SharedDigit.hasSharedDigit(9, 99));
  }

  @Test
  void hasSharedDigit_for_args_having_shared_digit_2() {
    assertTrue(SharedDigit.hasSharedDigit(15, 55));
  }

  @Test
  void hasSharedDigit_for_args_having_shared_digit_3() {
    assertTrue(SharedDigit.hasSharedDigit(12, 13));
  }
}