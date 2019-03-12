package com.step.Generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CricketTeamTest {

    @Test
    void getName() {
        CricketTeam india = new CricketTeam("India", 2, 1, 1);
        assertEquals("India", india.getName());
    }

    @Test
    void getTotalMatches() {
        CricketTeam india = new CricketTeam("India", 2, 1, 1);
        assertEquals(4, india.getTotalMatches());
    }

    @Test
    void getTotalPoints() {
        CricketTeam india = new CricketTeam("India", 2, 1, 1);
        assertEquals(5, india.getTotalPoints());
    }
}