package com.zakaria.katas.bowling;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Enable this kata when you start")
class BowlingGameTest {
    @Test void gutterGameScoresZero() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i++) game.roll(0);
        assertEquals(0, game.score());
    }
    // Next: all ones, one spare, one strike, perfect game.
}
