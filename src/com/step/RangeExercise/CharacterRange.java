package com.step.RangeExercise;

import java.util.ArrayList;

public class CharacterRange implements Range<Character> {

    private char end;
    private char start;

    public CharacterRange(char start, char end) {
        this.end = end;
        this.start = start;
    }

    @Override
    public ArrayList<Character> getAll() {
        ArrayList<Character> characters = new ArrayList<>();

        for (char character = this.start; character <= this.end; character++) {
            characters.add(character);
        }

        return characters;
    }

    @Override
    public boolean containsElement(Character givenElement) {
        ArrayList<Character> characters = getAll();
        return characters.contains(givenElement);
    }
}
