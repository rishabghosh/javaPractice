package com.step.Generics;

import org.junit.jupiter.api.Test;

class CricketLeagueTest {

    @Test
    void displayTeamsInOrder() {
        CricketLeague cricketLeague = new CricketLeague();
        CricketTeam india = new CricketTeam("India", 2, 1, 1);
        CricketTeam aus = new CricketTeam("Aus", 3, 1, 0);
        cricketLeague.addTeam(india);
        cricketLeague.addTeam(aus);
        cricketLeague.displayTeamsInOrder();
    }
}