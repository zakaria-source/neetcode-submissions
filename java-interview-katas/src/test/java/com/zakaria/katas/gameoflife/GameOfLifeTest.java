package com.zakaria.katas.gameoflife;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Enable this kata when you start")
class GameOfLifeTest {
    @Test void lonelyCellDies() {
        boolean[][] next = new GameOfLife().nextGeneration(new boolean[][]{{true}});
        assertFalse(next[0][0]);
    }
    // Add the four Conway rules and test still-life / oscillator patterns.
}
