package com.step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeenNumberCheckerTest {

  @Test
  void hasTeen_for_age_of_third_person_is_19() {
    assertTrue(TeenNumberChecker.hasTeen(9, 99, 19));
  }

  @Test
  void hasTeen_for_age_of_second_person_is_15() {
    assertTrue(TeenNumberChecker.hasTeen(23, 15, 42));
  }

  @Test
  void hasTeen_for_none_having_age_between_13_and_19() {
    assertFalse(TeenNumberChecker.hasTeen(22,23,34));
  }
}