package com.step.Generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootballTeamTest {

    @Test
    void getName() {
        FootballTeam india = new FootballTeam("India", 5, 2, 1);
        assertEquals("India", india.getName());
    }

    @Test
    void getTotalMatches() {
        FootballTeam india = new FootballTeam("India", 5, 2, 1);
        assertEquals(8, india.getTotalMatches());
    }

    @Test
    void getTotalPoints() {
        FootballTeam india = new FootballTeam("India", 5, 2, 1);
        assertEquals(8, india.getTotalPoints());
    }
}