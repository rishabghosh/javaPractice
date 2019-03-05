package com.step;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SpeedConverterTest {

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  @DisplayName("toMilesPerHour should return a positive value if correct value of KM is passed")
  void toMilesPerHour_for_correct_value() {
    long actual = SpeedConverter.toMilesPerHour(1);
    assertEquals(1, actual);
  }

  @Test
  @DisplayName("toMilesPerHour should return a positive value if wrong value of KM is passed")
  void toMilesPerHourTest_for_wrong_value() {
    long actual = SpeedConverter.toMilesPerHour(-2);
    assertEquals(-1, actual);
  }

@Test
@DisplayName("toMilesPerHour should return 1 for value 1")
  void toMilesPerHour_for_value_1(){
    long actual = SpeedConverter.toMilesPerHour(1);
    assertEquals(1,actual);
}

  @Test
  @DisplayName("toMilesPerHour should return 1 for value 2")
  void toMilesPerHour_for_value_2(){
    long actual = SpeedConverter.toMilesPerHour(2);
    assertEquals(1,actual);
  }

  @Test
  @DisplayName("toMilesPerHour should return 2 for value 3")
  void toMilesPerHour_for_value_3(){
    long actual = SpeedConverter.toMilesPerHour(3);
    assertEquals(2,actual);
  }


}