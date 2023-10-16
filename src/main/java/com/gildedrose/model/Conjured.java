package com.gildedrose.model;

import static com.gildedrose.enums.Tickets.CONJURED_MANA_CAKE;

public class Conjured extends Ticket{
    public Conjured(int sellIn, int quality, int outOfDate) {
        super(CONJURED_MANA_CAKE, sellIn, quality, 50, outOfDate);
    }

    public void update(){
        decreaseSellIn();
        decreaseQuality(2);
    }

}
