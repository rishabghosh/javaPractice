package com.step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalComparatorTest {

  @Test
  void areEqualByThreeDecimalPlaces_two_negative_numbers_having_decimals() {
    assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
  }

  @Test
  void areEqualByThreeDecimalPlaces_two_positive_numbers_having_decimals() {
    assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.175));
  }

  @Test
  void areEqualByThreeDecimalPlaces_two_equal_positive_numbers() {
    assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
  }

  @Test
  void areEqualByThreeDecimalPlaces_two_equal_numbers_with_opposite_signs() {
    assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(3.123, -3.123));
  }
}