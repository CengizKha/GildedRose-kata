package com.gildedrose.model;

import com.gildedrose.enums.Tickets;

public class Ticket extends Item {
    protected int maxQuality;
    protected int outOfDate;

    public Ticket(String name, int sellIn, int quality, int outOfDate) {
        // What to do when value sellIn & Quality == 0 ?
        // if outOfDate can be 0 ?
        super(name, sellIn, quality);
        this.maxQuality = 50; // default Value
        this.outOfDate = outOfDate;
    }

    public Ticket(Tickets tickets, int sellIn, int quality, int maxQuality, int outOfDate) {
        super(tickets.name(), sellIn, quality);
        this.maxQuality = maxQuality;
        this.outOfDate = outOfDate;
    }

    public void update(){
        decreaseSellIn();
        decreaseQuality(1);
    }

    protected void decreaseSellIn(){
        if(sellIn > 0){
            sellIn = sellIn -1;
        }
    }

    protected void increaseQuality(int value){
        if(quality + value > maxQuality){
            quality = maxQuality;
        } else {
            quality = quality + value;
        }
    }

    protected void decreaseQuality(int value){
        if(quality - value < 0){
            quality = 0;
        } else {
            if(outOfDate > sellIn){
                quality = quality - (value *2);
            } else {
                quality = quality - value;
            }
        }
    }

}
