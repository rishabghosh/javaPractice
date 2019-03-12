package com.step.polymorphism;

public class WebPage extends NonInteractiveWebPage {
    private String clickAlert = "You Clicked 1 time";

    public void click() {
        System.out.println(clickAlert);
    }
}
