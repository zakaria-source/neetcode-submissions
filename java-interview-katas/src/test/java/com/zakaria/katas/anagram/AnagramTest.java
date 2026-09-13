package com.zakaria.katas.anagram;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Enable this kata when you start")
class AnagramTest {
    @Test void detectsAnagram() { assertTrue(new Anagram().areAnagrams("listen", "silent")); }
    @Test void rejectsDifferentWords() { assertFalse(new Anagram().areAnagrams("java", "kotlin")); }
}
