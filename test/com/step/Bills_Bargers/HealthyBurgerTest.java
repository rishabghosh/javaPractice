package com.step.Bills_Bargers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthyBurgerTest {

  @Test
  void getTotalPrice() {
    HealthyBurger healthyBurger = new HealthyBurger(true, 30.0, true, true);
    double actual = healthyBurger.getTotalPrice();
    assertEquals(80.0, actual);
  }

  @Test
  void getTotalPrice2() {
    HealthyBurger healthyBurger = new HealthyBurger(false, 30.0, true, true);
    double actual = healthyBurger.getTotalPrice();
    assertEquals(50.0, actual);
  }

  @Test
  void getName1(){
    HealthyBurger healthyBurger = new HealthyBurger(30.0);
    String actual = healthyBurger.getName();
    assertEquals("Super Brown Rye Bread Without Meat", actual);
  }

  @Test
  void getName2(){
    HealthyBurger healthyBurger = new HealthyBurger(true,30.0);
    String actual = healthyBurger.getName();
    assertEquals("Super Brown Rye Bread With Meat", actual);
  }
}