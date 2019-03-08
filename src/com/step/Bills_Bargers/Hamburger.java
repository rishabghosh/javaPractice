package com.step.Bills_Bargers;

public class Hamburger {
  private double basePrice;
  private String rollType;
  private boolean hasMeat;
  private String name;

  public Hamburger(String baseName, String rollType, double basePrice) {
    this(baseName, rollType, false, basePrice);
  }

  public Hamburger(String baseName, String rollType, boolean hasMeat, double basePrice) {
    this.hasMeat = hasMeat;
    this.name = generateName(baseName, rollType);
    this.rollType = rollType;
    this.basePrice = basePrice;
  }

  public double getBasePrice() {
    if (hasMeat) basePrice += 30.0;
    return basePrice;
  }

  private String generateName(String baseName, String rollType){
    if(this.hasMeat) return generateNameWithMeat(baseName, rollType);
    return generateNameWithoutMeat(baseName, rollType);
  }

  private String generateNameWithMeat(String baseName, String rollType){
    return baseName + " " + rollType + " With Meat";
  }

  private String generateNameWithoutMeat(String baseName, String rollType){
    return baseName  + " " + rollType + " Without Meat";
  }

  public String getName(){
    return name;
  }
}
