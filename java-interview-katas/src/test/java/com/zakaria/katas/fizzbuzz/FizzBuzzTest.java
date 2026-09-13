package com.zakaria.katas.fizzbuzz;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Enable this kata when you start")
class FizzBuzzTest {
    @ParameterizedTest @CsvSource({"1,1", "3,Fizz", "5,Buzz", "15,FizzBuzz"})
    void returnsExpectedValue(int input, String expected) { assertEquals(expected, new FizzBuzz().value(input)); }
}
