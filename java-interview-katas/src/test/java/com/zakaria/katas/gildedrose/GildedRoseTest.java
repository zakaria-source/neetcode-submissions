package com.zakaria.katas.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {
    @Test void normalItemDegrades() {
        var item = new GildedRose.Item("normal", 10, 20);
        new GildedRose(new GildedRose.Item[]{item}).updateQuality();
        assertEquals(9, item.sellIn); assertEquals(19, item.quality);
    }
    @Test void agedBrieImproves() {
        var item = new GildedRose.Item("Aged Brie", 10, 20);
        new GildedRose(new GildedRose.Item[]{item}).updateQuality();
        assertEquals(21, item.quality);
    }
    // Add characterization tests BEFORE refactoring. Then add Conjured items.
}
