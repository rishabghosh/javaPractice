package com.step.RangeExercise;

import java.util.ArrayList;

public class NumberRange implements Range<Integer> {

    private int end;
    private int start;

    public NumberRange(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public ArrayList<Integer> getAll() {
        ArrayList<Integer> integers = new ArrayList<>();

        for (int number = this.start; number <= this.end; number++){
            integers.add(number);
        }

        return integers;
    }

    @Override
    public boolean containsElement(Integer givenElement) {
        ArrayList<Integer> integers = getAll();
        return integers.contains(givenElement);
    }

}
