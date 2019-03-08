package com.step.Bills_Bargers;

public class HealthyBurger extends Hamburger {
  private double additionalPrice;
  private boolean hasLettuce;
  private boolean hasTomato;

  public HealthyBurger(boolean hasMeat, double basePrice, boolean hasLettuce, boolean hasTomato) {
    super("Super", "Brown Rye Bread", hasMeat, basePrice);
    this.hasLettuce = hasLettuce;
    this.hasTomato = hasTomato;
    this.additionalPrice = calculateAdditionalPrice();
  }

  public HealthyBurger(double basePrice){
    this(false, basePrice, false, false);
  }

  public HealthyBurger(boolean hasMeat, double basePrice){
    this(hasMeat, basePrice, false, false);
  }

  private double calculateAdditionalPrice() {
    double extraCharges = 0.0;
    if (hasTomato) extraCharges += 10.0;
    if (hasLettuce) extraCharges += 10.0;
    return extraCharges;
  }

  public double getTotalPrice() {
    return getBasePrice() + additionalPrice;
  }

}
