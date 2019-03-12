package com.step.Generics;

import java.util.ArrayList;
import java.util.List;

public abstract class League<T extends Team> {
    private String name;
    private String sport;
    private List<T> teams;

    public League(String name, String sport) {
        this.name = name;
        this.sport = sport;
        this.teams = new ArrayList<T>();
    }

    public void addTeam(T team) {
        System.out.println(this.teams);
        this.teams.add(team);
    }

    private void sortTeams(T teams) {

//        Comparator<T> comparator = new Comparator<>() {
//            @Override
//            public int compare(T o1, T o2) {
//                return team1.compare(team2);
//            }
//
//        };

    }

    public void displayTeamsInOrder() {
//        sortTeams(this.teams);
        for (T team : this.teams) {
            System.out.println(team.getName());
        }
    }
}