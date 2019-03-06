package com.step;

public class TeenNumberChecker {
  public static boolean hasTeen(int person1, int person2, int person3) {
    return isTeen(person1) || isTeen(person2) || isTeen(person3);
  }

  public static boolean isTeen(int age) {
    return (age >= 13 && age <= 19);
  }
}
