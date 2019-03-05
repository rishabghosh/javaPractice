package com.step;

public class SpeedConverter {
  public static void main(String[] args) {
    printConversion(-2);
  }

  public  static long toMilesPerHour(double kilometersPerHour){
    if(kilometersPerHour < 0){
      // -1 indicates invalid value
      return -1;
    }
    double milesEquivalentOfOneKM = 1.60934D;
    double equivalentMilesPerHour = kilometersPerHour/milesEquivalentOfOneKM;
    //here chosen Math.round takes a double and returns a long
    return Math.round(equivalentMilesPerHour);
  }

  public static  void printConversion(double kilometersPerHour){
    long equivalentMilesPerHour = toMilesPerHour(kilometersPerHour);
    String message = kilometersPerHour + " km/h = " + equivalentMilesPerHour  + " mi/h";
    if(equivalentMilesPerHour == -1){
      message = "Invalid Value";
    }
    System.out.println(message);
  }
}
