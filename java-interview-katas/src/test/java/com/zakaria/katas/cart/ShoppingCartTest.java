package com.zakaria.katas.cart;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Disabled("Enable this kata when you start")
class ShoppingCartTest {
    @Test void emptyCartCostsZero() { assertEquals(0, new ShoppingCart().total()); }
    @Test void itemIsAddedToTotal() {
        ShoppingCart cart = new ShoppingCart(); cart.add("A", 50);
        assertEquals(50, cart.total());
    }
    // Next: quantities, 3-for-2, percentage promotion, strategy design.
}
