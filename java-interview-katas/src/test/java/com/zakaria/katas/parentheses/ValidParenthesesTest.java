package com.zakaria.katas.parentheses;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Enable this kata when you start")
class ValidParenthesesTest {
    @ParameterizedTest @CsvSource({"'()',true", "'()[]{}',true", "'(]',false", "'([)]',false", "'{[]}',true"})
    void validates(String input, boolean expected) { assertEquals(expected, new ValidParentheses().isValid(input)); }
}
