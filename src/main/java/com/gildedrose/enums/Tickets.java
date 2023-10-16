package com.gildedrose.enums;

public enum Tickets {
    AGED_BRIDE("Aged Brie"),
    BACKSTAGE_PASSES("Backstage passes to a TAFKAL80ETC concert"),
    SULFURA_HAND_OF_RAGNAROS("Sulfuras, Hand of Ragnaros"),
    CONJURED_MANA_CAKE("Conjured Mana Cake");
    private String name;

    Tickets(String name) {
        this.name = name;
    }

}
