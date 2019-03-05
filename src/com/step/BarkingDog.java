package com.step;

public class BarkingDog {
  public  static boolean shouldWakeUp(boolean barking, int hourOfDay){
    if(hourOfDay < 0 || hourOfDay > 23 ){
      System.out.println("Invalid Value");
      return false;
    }
    if(barking && (hourOfDay < 8 || hourOfDay > 22)){
    return true;
    }
    return false;
  }
}
