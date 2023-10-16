package com.gildedrose;

import com.gildedrose.model.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Ticket[] items = new Ticket[] { new Ticket("foo", 0, 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items.get(0).name);
    }

}
