package com.step;

import java.util.Arrays;

public class ArraySorter {
  public static int[] sortArray(int[] arrOfInts) {
    int[] cloneOfArr = arrOfInts.clone();
    Arrays.parallelSort(cloneOfArr);
    return cloneOfArr;
  }

  public static int[] reverseSortArray(int[] arrOfInts) {
    int[] sortedArray = sortArray(arrOfInts);
    int arrLength = sortedArray.length;
    int[] reverseSortedArray = new int[arrLength];

    for (int index = 0; index < arrLength; index++) {
      reverseSortedArray[index] = sortedArray[arrLength - index - 1];
    }

    return reverseSortedArray;
  }
}