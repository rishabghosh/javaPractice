package com.step.polymorphism;

public class PDFPages implements Printable {
    private String text = "Reading PDF";

    @Override
    public String readContent() {
        return text;
    }
}

