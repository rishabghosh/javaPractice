package com.step;

public class EvenDigitSum {
  public static int getEvenDigitSum(int number){
    if(number < 0) return -1;
    int cloneOfNumber = number;
    int sum = 0;

    while(cloneOfNumber > 0){
        int candidate = cloneOfNumber % 10;
        if(candidate % 2 == 0) sum += candidate;
        cloneOfNumber = cloneOfNumber/10;
    }
    return sum;
  }
}
