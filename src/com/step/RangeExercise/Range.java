package com.step.RangeExercise;

import java.util.ArrayList;

public interface Range<T> {
    ArrayList<T> getAll();
    boolean containsElement(T givenElement);
}
