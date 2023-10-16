package com.gildedrose.model;

import static com.gildedrose.enums.Tickets.SULFURA_HAND_OF_RAGNAROS;

public class Sulfuras extends Ticket{

    public Sulfuras(int sellIn, int quality) {
        super(SULFURA_HAND_OF_RAGNAROS, sellIn, quality, 80, 0);
    }

    public void update(){
        decreaseSellIn();
    }

}
