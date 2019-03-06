package com.step;

import java.util.Scanner;

public class ControlFlowStatement {

  public static void main(String[] args) {
    inputThenPrintSumAndAverage();
  }

  public static void inputThenPrintSumAndAverage() {
    int sum = 0;
    long avg = 0L;
    int numbersEntered = 0;
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("Enter an Integer:");
      if (sc.hasNextInt()) {
        int number = sc.nextInt();
        numbersEntered = numbersEntered + 1;
        sum = sum + number;
        avg = (long) (sum / numbersEntered);
        System.out.println("You have entered: " + number);
      } else {
        sc.close();
        break;
      }
    }
    System.out.println(getPrintableFormat(sum, avg));
  }

  public static String getPrintableFormat(int sum, long avg) {
    return "SUM = " + sum + " AVG = " + avg;
  }

}