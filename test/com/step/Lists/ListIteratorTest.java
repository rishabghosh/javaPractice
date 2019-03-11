package com.step.Lists;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ListIteratorTest {

  @Test
  void next() {
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      numbers.add(i);
    }

    ListIterator listIterator = new ListIterator(numbers);

    while (listIterator.hasNext()) {
      System.out.println(listIterator.next());
    }

    //It will throw a NoSuchElementException
    listIterator.next();
  }
}