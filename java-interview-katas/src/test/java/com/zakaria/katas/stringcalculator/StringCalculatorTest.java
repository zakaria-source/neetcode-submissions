package com.zakaria.katas.stringcalculator;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Enable this kata when you start")
class StringCalculatorTest {
    private final StringCalculator calculator = new StringCalculator();

    @Test void emptyStringReturnsZero() { assertEquals(0, calculator.add("")); }
    @Test void oneNumberReturnsItself() { assertEquals(7, calculator.add("7")); }
    @Test void twoCommaSeparatedNumbersAreAdded() { assertEquals(3, calculator.add("1,2")); }

    // Continue incrementally: N numbers, newlines, custom delimiter,
    // negatives rejected, ignore numbers > 1000, multi-char delimiters...
}
