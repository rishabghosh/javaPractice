package com.step.Sets;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SetOperationsTest {

    @Test
    void union() {
        /**
         * HashSet has a constructor which takes a collection
         * Arrays as list returns an list which is a collection
         */

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));

        Set<Integer> actual = SetOperations.union(set1, set2);
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        assertEquals(expected, actual);
    }

    @Test
    void intersection() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));

        Set<Integer> actual = SetOperations.intersection(set1, set2);
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2));

        assertEquals(expected, actual);
    }

    @Test
    void difference() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));

        //elements of set1 which is not in set2
        Set<Integer> actual = SetOperations.difference(set1, set2);
        Set<Integer> expected = new HashSet<>(Arrays.asList(4));

        assertEquals(expected, actual);
    }

}