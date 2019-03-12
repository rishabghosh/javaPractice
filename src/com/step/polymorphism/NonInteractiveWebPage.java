package com.step.polymorphism;

public class NonInteractiveWebPage implements Displayable, Printable {
    private String text = "This is some text";

    @Override
    public void display(String toPrint) {
        System.out.println(toPrint);
    }

    @Override
    public String readContent() {
        return text;
    }
}
