package com.gildedrose.model;

import static com.gildedrose.enums.Tickets.AGED_BRIDE;

public class AgedBrie extends Ticket {

    public AgedBrie(int sellIn, int quality, int outOfDate) {
        super(AGED_BRIDE, sellIn, quality, 50, outOfDate);
        // TODO SHOULD TROW EXCEPTION if sellIn & quality is > 0
    }

    public void update(){
        decreaseSellIn();
        increaseQuality(1);
    }

}
