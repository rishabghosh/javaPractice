package com.step;

public class NumberInWord {

    public static void printNumberInWord(int number){
      String[] numbersInWords = {"ZERO", "ONE", "TWO", "THREE",
        "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
      /*
        also can declare an array of strings like this below
        String[] myStringArray = new String[]{"a", "b", "c"};
       */
      if(number < 0 || number > 9){
        System.out.println("OTHER");
        return;
      }
      System.out.println(numbersInWords[number]);
    }
  }
