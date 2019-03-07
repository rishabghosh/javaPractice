package com.step;

public class NumberPalindrome {
  public static boolean isPalindrome(int number){
    Integer absoluteInt = Math.abs(number);
    String signifiedInt = absoluteInt.toString();
    StringBuilder stringBuilder = new StringBuilder(signifiedInt);
    StringBuilder reversedInt = stringBuilder.reverse();
    return stringBuilder == reversedInt;
  }
}
