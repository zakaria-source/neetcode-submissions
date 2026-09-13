package com.zakaria.katas.marsrover;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Enable this kata when you start")
class MarsRoverTest {
    @Test void movesNorth() {
        MarsRover rover = new MarsRover(0, 0, 'N');
        rover.execute("M");
        assertEquals("0:1:N", rover.position());
    }
    // Next: L/R rotation, multiple commands, grid wrapping, obstacles.
}
