package com.gildedrose;

import com.gildedrose.model.Ticket;

import java.util.Arrays;
import java.util.List;

class GildedRose {

    List<Ticket> items;

    public GildedRose(Ticket[] items) {
        this.items = Arrays.asList(items);
    }

    public void updateQuality() {
        items.forEach(item -> item.update() );
    }

}