package com.zakaria.katas.gildedrose;

public class GildedRose {
    public static class Item {
        public String name; public int sellIn; public int quality;
        public Item(String name, int sellIn, int quality) { this.name=name; this.sellIn=sellIn; this.quality=quality; }
    }

    private final Item[] items;
    public GildedRose(Item[] items) { this.items = items; }

    // Intentionally ugly legacy code. Characterize before refactoring.
    public void updateQuality() {
        for (Item item : items) {
            if (!item.name.equals("Aged Brie") && !item.name.equals("Sulfuras, Hand of Ragnaros")) {
                if (item.quality > 0) item.quality--;
            } else if (item.name.equals("Aged Brie") && item.quality < 50) {
                item.quality++;
            }
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) item.sellIn--;
            if (item.sellIn < 0) {
                if (!item.name.equals("Aged Brie") && !item.name.equals("Sulfuras, Hand of Ragnaros")) {
                    if (item.quality > 0) item.quality--;
                } else if (item.name.equals("Aged Brie") && item.quality < 50) item.quality++;
            }
        }
    }
}
