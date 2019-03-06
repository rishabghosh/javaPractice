package com.step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCatTest {

  @Test
  void isCatPlaying_in_summer_and_temperature_is_10() {
    assertFalse(PlayingCat.isCatPlaying(true, 10));
  }

  @Test
  void isCatPlaying_not_in_summer_and_temperature_is_36() {
    assertFalse(PlayingCat.isCatPlaying(false, 36));
  }

  @Test
  void isCatPlaying_not_in_summer_and_temperature_is_35() {
    assertTrue(PlayingCat.isCatPlaying(false, 35));
  }

}