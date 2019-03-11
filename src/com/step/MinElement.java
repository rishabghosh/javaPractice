package com.step;

import java.util.Scanner;

public class MinElement {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int[] ints = readIntegers(5);
    int minValue = findMin(ints);
    System.out.printf("Min numbers is %s ", minValue);
  }

  private static int[] readIntegers(int count) {
    int[] ints = new int[count];
    for (int index = 0; index < count; index++) {
      System.out.println("Enter a number : ");
      ints[index] = scanner.nextInt();
    }
    return ints;
  }

  private static int findMin(int[] ints) {
    int minValue = ints[0];
    for (int index = 1; index < ints.length; index++) {
      if (ints[index] < minValue) minValue = ints[index];
    }
    return minValue;
  }
}
