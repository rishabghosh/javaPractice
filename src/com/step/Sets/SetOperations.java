package com.step.Sets;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> firstSet, Set<Integer> secondSet){
        Set<Integer> intSet = new HashSet<>();

        intSet.addAll(firstSet);
        intSet.addAll(secondSet);

        return intSet;
    }

    public static Set<Integer> intersection(Set<Integer> firstSet, Set<Integer> secondSet){
        Set<Integer> intSet = new HashSet<>(firstSet);
        intSet.retainAll(secondSet);
        return intSet;
    }

    public static HashSet<Integer> difference(Set<Integer> firstSet, Set<Integer> secondSet){
        HashSet<Integer> integers = new HashSet<>();
        /**
         * if second set does not contains any element of the first set
         */
        for (Integer element: firstSet) {
            if(!secondSet.contains(element)){
                integers.add(element);
            }
        }

        return integers;
    }
}
