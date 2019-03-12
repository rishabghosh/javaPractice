package com.step.CardExercise;

public class IdentityCard implements Duplicable<DuplicateIdentityCard>{
    private String name;
    private long id;

    public IdentityCard(String name, long id) {
        this.name = name;
        this.id = id;
    }


    @Override
    public DuplicateIdentityCard makeDublicate() {
        return new DuplicateIdentityCard(this.name, this.id);
    }
}
