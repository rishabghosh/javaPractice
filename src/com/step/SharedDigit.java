package com.step;

public class SharedDigit {
  public static boolean hasSharedDigit(int num1, int num2) {
    if (num1 < 10 || num1 > 99) return false;
    if (num2 < 10 || num2 > 99) return false;

    String num1InString = Integer.toString(num1);
    String num2InString = Integer.toString(num2);
    int maxLength = Math.max(num1InString.length(), num2InString.length());

    for (int position = 0; position < maxLength; position++) {
      String currentNum1Digit = num1InString.substring(position, position + 1);
      if (num2InString.contains(currentNum1Digit)) return true;
    }
    return false;
  }
}
