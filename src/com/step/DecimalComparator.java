package com.step;

public class DecimalComparator {
  public static void main(String[] args) {
  }

  public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
    int newNum1 = getEquivalentInteger(num1);
    int newNum2 = getEquivalentInteger(num2);
    if(newNum1 == newNum2){
      return true;
    }
    return false;
  }

  public static int getEquivalentInteger(double num){
    return (int) (num * 1000);
  }
}
