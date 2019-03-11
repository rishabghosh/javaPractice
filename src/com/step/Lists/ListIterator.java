package com.step.Lists;

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {
  private int index;
  private List listToIterate;


  public ListIterator(List listToIterate) {
    this.listToIterate = listToIterate;
    this.index = -1;
  }

  public boolean hasNext() {
    int size = listToIterate.size();
    return index < size;
  }

  public Integer next() {
    if (hasNext()) {
      this.index += 1;
      return (Integer) this.listToIterate.get(index);
    }
    throw new NoSuchElementException();
  }
}
