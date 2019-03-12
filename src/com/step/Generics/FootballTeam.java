package com.step.Generics;

public class FootballTeam extends Team{


    public FootballTeam(String name, int matchesWon, int matchesDrawn, int matchesLost) {
        super(name, matchesWon, matchesDrawn, matchesLost);
    }

    @Override
    public int getTotalPoints() {
        int matchesWon = super.getMatchesWon();
        int matchesDrawn = super.getMatchesDrawn();
        int matchesLost = super.getMatchesLost();
        return matchesWon * 2 + matchesDrawn * 0 + matchesLost * (-2);
    }
}
