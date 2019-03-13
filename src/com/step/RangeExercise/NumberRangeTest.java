package com.step.RangeExercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberRangeTest {

    @Test
    void getAll() {
        Range range = new NumberRange(1,3);
        List<Integer> expected = Arrays.asList(1,2,3);
        assertTrue(range.getAll().equals(expected));
    }

    @Test
    void containsElement_for_number_in_range() {
        Range range = new NumberRange(1,3);
        boolean actual = range.containsElement(1);
        assertTrue(actual);
    }

    @Test
    void containsElement_for_not_in_number_in_range() {
        Range range = new NumberRange(1,3);
        boolean actual = range.containsElement(7);
        assertFalse(actual);
    }
}