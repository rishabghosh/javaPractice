package com.step.compositoin;

public class JewelleryBox {
  private Jewellery jewellery;
  private JewelleryBox jewelleryBox;
  private int jewelleryCount;

  public JewelleryBox(JewelleryBox jewelleryBox) {
    this(null, jewelleryBox);
  }

  public JewelleryBox(Jewellery jewellery, JewelleryBox jewelleryBox) {
    this.jewellery = jewellery;
    this.jewelleryBox = jewelleryBox;
  }

  public JewelleryBox() {
    this(null, null);
  }

  public JewelleryBox(Jewellery jewellery) {
    this(jewellery, null);
  }

  public int totalJewelleries() {
    if (jewellery != null) jewelleryCount = 1;
    if (jewelleryBox != null) {
      jewelleryCount += jewelleryBox.totalJewelleries();
    }
    return jewelleryCount;
  }
}
