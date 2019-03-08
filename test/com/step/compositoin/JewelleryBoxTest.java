package com.step.compositoin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JewelleryBoxTest {
  @Test
  void name() {
    JewelleryBox _5thLevelBox = new JewelleryBox();
    JewelleryBox _4thLevelBox = new JewelleryBox(_5thLevelBox);

    Jewellery necklace = new Jewellery("necklace");
    JewelleryBox _3rdLevelBox = new JewelleryBox(necklace, _4thLevelBox);

    Jewellery ring = new Jewellery("ring");
    JewelleryBox _2ndLevelBox = new JewelleryBox(ring, _3rdLevelBox);

    JewelleryBox _1stLevelBox = new JewelleryBox(_2ndLevelBox);

    assertEquals(2, _1stLevelBox.totalJewelleries());
  }

}