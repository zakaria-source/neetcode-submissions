package com.zakaria.katas.frequency;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Enable this kata when you start")
class FrequencyCounterTest {
    @Test void countsCharacters() { assertEquals(Map.of('a',2,'b',1), new FrequencyCounter().count("aba")); }
    @Test void findsFirstNonRepeated() { assertEquals('w', new FrequencyCounter().firstNonRepeated("swiss")); }
}
