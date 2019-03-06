package com.step;

public class EqualSumChecker {
  public static boolean hasEqualSum(int first, int second, int third) {
    int sumOfFirstSecond = first + second;
    return sumOfFirstSecond == third;
  }
}
