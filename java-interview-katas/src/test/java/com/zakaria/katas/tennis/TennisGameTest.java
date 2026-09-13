package com.zakaria.katas.tennis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TennisGameTest {
    @Test void initialScore() { assertEquals("Love-All", new TennisGame().score()); }
    @Test void fifteenLove() { var g=new TennisGame(); g.wonPoint("player1"); assertEquals("Fifteen-Love", g.score()); }
    @Test void deuce() { var g=new TennisGame(); for(int i=0;i<3;i++){g.wonPoint("player1");g.wonPoint("player2");} assertEquals("Deuce", g.score()); }
    @Test void advantage() { var g=new TennisGame(); for(int i=0;i<3;i++){g.wonPoint("player1");g.wonPoint("player2");} g.wonPoint("player1"); assertEquals("Advantage player1", g.score()); }
}
