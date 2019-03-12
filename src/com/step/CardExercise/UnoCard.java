package com.step.CardExercise;

public class UnoCard implements Duplicable<DuplicateUnoCard>{
    private int number;
    private String color;

    public UnoCard(int number, String color) {
        this.number = number;
        this.color = color;
    }


    @Override
    public DuplicateUnoCard makeDublicate() {
        return new DuplicateUnoCard(this.number, this.color);
    }
}
