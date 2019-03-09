package com.step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySorterTest {

  @Test
  void sortArray() {
    int[] arrOfInts = {12, 23, 13, 14, 15, 14};
    int[] actual = ArraySorter.sortArray(arrOfInts);
    int[] expected = {12, 13, 14, 14, 15, 23};
    assertArrayEquals(expected, actual);
  }

  @Test
  void reverseSortArray() {
    int[] arrOfInts = {12, 23, 13, 14, 15, 14};
    int[] actual = ArraySorter.reverseSortArray(arrOfInts);
    int[] expected = {23, 15, 14, 14, 13, 12};
    assertArrayEquals(expected, actual);
  }
}