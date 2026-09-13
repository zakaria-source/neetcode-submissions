package com.zakaria.katas.tennis;

public class TennisGame {
    private int p1; private int p2;
    public void wonPoint(String player) { if ("player1".equals(player)) p1++; else p2++; }

    // Intentionally branch-heavy. Refactor without changing behaviour.
    public String score() {
        if (p1 == p2) {
            if (p1 == 0) return "Love-All";
            if (p1 == 1) return "Fifteen-All";
            if (p1 == 2) return "Thirty-All";
            return "Deuce";
        }
        if (p1 >= 4 || p2 >= 4) {
            int diff = p1 - p2;
            if (diff == 1) return "Advantage player1";
            if (diff == -1) return "Advantage player2";
            if (diff >= 2) return "Win for player1";
            return "Win for player2";
        }
        String s1 = p1 == 0 ? "Love" : p1 == 1 ? "Fifteen" : p1 == 2 ? "Thirty" : "Forty";
        String s2 = p2 == 0 ? "Love" : p2 == 1 ? "Fifteen" : p2 == 2 ? "Thirty" : "Forty";
        return s1 + "-" + s2;
    }
}
