package com.step.RangeExercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CharacterRangeTest {

    @Test
    void getAll() {
        Range range = new CharacterRange('a', 'd');
        List<Character> expected = Arrays.asList('a', 'b', 'c', 'd');
        assertTrue(range.getAll().equals(expected));
    }

    @Test
    void containsElement_for_range_contains_element() {
        Range range = new CharacterRange('a', 'd');
        boolean actual = range.containsElement('a');
        assertTrue(actual);
    }

    @Test
    void containsElement_for_range_does_not_contains_element() {
        Range range = new CharacterRange('a', 'd');
        boolean actual = range.containsElement('z');
        assertFalse(actual);
    }
}