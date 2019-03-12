package com.step.CardExercise;

public abstract class Card implements Duplicable{

    public boolean isPlayingCard() {
        return false;
    }

    public boolean isForPersonalUse(){
        return false;
    }

}
