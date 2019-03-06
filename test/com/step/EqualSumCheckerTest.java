package com.step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualSumCheckerTest {

  @Test
  void hasEqualSum_for_sum_of_first_two_arg_is_greater_than_the_third_number() {
    assertFalse(EqualSumChecker.hasEqualSum(1, 1, 1));
  }

  @Test
  void hasEqualSum_for_sum_of_first_two_arg_is_same_as_the_third_number() {
    assertTrue(EqualSumChecker.hasEqualSum(1, 1, 2));
  }
}
