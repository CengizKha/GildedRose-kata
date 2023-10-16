package com.gildedrose.model;

import static com.gildedrose.enums.Tickets.BACKSTAGE_PASSES;

public class BackStagePasse extends Ticket {

    public BackStagePasse(int sellIn, int quality, int outOfDate) {
        super(BACKSTAGE_PASSES, sellIn, quality, 50, outOfDate);
        // TODO SHOULD TROW EXCEPTION if sellIn & quality is > 0
    }

    public void update(){
        decreaseSellIn();
        updateQuality();
    }

    protected void updateQuality(){
        if(sellIn == 0){
            quality = 0;
        } else {
            if(quality < maxQuality) {
                if (sellIn <= 5) { // last 5 days
                    increaseQuality(3);
                } else if (sellIn <= 10) { // last 10 days
                    increaseQuality(2);
                }
            }
        }
    }

    protected final void decreaseQuality(int value){
        // Nothing TODO
    }

}
