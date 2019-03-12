package com.step.Generics;

public abstract class Team {
    private String name;
    private int matchesWon;
    private int matchesDrawn;
    private int matchesLost;

    public Team(String name, int matchesWon, int matchesDrawn, int matchesLost) {
        this.name = name;
        this.matchesWon = matchesWon;
        this.matchesDrawn = matchesDrawn;
        this.matchesLost = matchesLost;
    }

    public String getName() {
        return this.name;
    }

    public int getTotalMatches() {
        return this.matchesWon + this.matchesDrawn + this.matchesLost;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public int getMatchesDrawn() {
        return matchesDrawn;
    }

    public int getMatchesLost() {
        return matchesLost;
    }

    public int getTotalPoints(){
        return this.matchesWon * 2 + this.matchesDrawn;
     }

     public int compare(Team team){
        return getTotalPoints() - team.getTotalPoints();
     }
}
