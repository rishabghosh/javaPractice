package com.step.polymorphism;

public class Console implements Displayable{

    @Override
    public void display(String toPrint) {
        System.out.println(toPrint);
    }
}
