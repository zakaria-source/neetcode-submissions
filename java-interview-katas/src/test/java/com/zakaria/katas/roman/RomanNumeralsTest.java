package com.zakaria.katas.roman;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Enable this kata when you start")
class RomanNumeralsTest {
    @ParameterizedTest @CsvSource({"1,I", "2,II", "4,IV", "5,V", "9,IX", "10,X"})
    void convertsNumbers(int input, String expected) {
        assertEquals(expected, new RomanNumerals().convert(input));
    }
}
