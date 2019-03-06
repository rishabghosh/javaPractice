package com.step;

public class LeapYear {
  public static void main(String[] args){
    System.out.println(isLeapYear(2000));
  }

  public static boolean isLeapYear(int year){
    if(year < 1 || year > 9999){
      return false;
    }

    if(isDivisibleBy4And100(year) || isEvenlyDivisibleBy400(year)){
      return true;
    }
    return false;
  }

  public static boolean isEvenlyDivisibleBy4(int year){
    return (year % 4 == 0);
  }

  public static boolean isEvenlyDivisibleBy100(int year){
    return (year % 100 == 0);
  }

  public static boolean isEvenlyDivisibleBy400(int year){
    return (year % 400 == 0);
  }

  public static boolean isDivisibleBy4And100(int year){
    return isEvenlyDivisibleBy4(year) && isEvenlyDivisibleBy100(year);
  }
}
