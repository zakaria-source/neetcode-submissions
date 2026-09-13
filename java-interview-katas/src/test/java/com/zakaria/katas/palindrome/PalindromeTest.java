package com.zakaria.katas.palindrome;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Enable this kata when you start")
class PalindromeTest {
    @Test void detectsPalindrome() { assertTrue(new Palindrome().isPalindrome("racecar")); }
    @Test void rejectsNonPalindrome() { assertFalse(new Palindrome().isPalindrome("java")); }
    // Discuss null/empty/case/punctuation requirements before coding them.
}
