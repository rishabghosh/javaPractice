package com.step.Bills_Bargers;

public class DeluxeHamburger extends Hamburger{
  private double additionalPrice;
  private boolean withChips;
  private boolean withDrink;

  public DeluxeHamburger(double basePrice, boolean withChips, boolean withDrink) {
    super("Deluxe", "Bread", true, basePrice);
    this.withChips = withChips;
    this.withDrink = withDrink;
    this.additionalPrice = calculateAdditonalPrice();
  }

  private double calculateAdditonalPrice(){
    double extraCharges = 0.0;
    if(withChips) extraCharges += 30.0;
    if (withDrink) extraCharges += 50.0;
    return extraCharges;
  }

  public double getTotalPrice(){
    return getBasePrice() + additionalPrice;
  }

}
