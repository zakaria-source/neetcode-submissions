package com.zakaria.katas.twosum;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Enable this kata when you start")
class TwoSumTest {
    @Test void returnsIndices() { assertArrayEquals(new int[]{0,1}, new TwoSum().find(new int[]{2,7,11,15}, 9)); }
    // Discuss expected behaviour when no pair exists.
}
