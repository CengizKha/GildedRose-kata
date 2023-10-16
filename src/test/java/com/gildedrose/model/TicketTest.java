package com.gildedrose.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TicketTest {

    @Test
    void update(){
        Ticket ticket = new Ticket("Elixir of the Mongoose", 5, 7, 5);

        ticket.update();

        assertEquals(4, ticket.sellIn);
        assertEquals(5, ticket.quality);
    }


    @Test
    void decreaseSellIn(){
        Ticket ticket = new Ticket("Elixir of the Mongoose", 1, 7, 2);

        ticket.decreaseSellIn();

        assertEquals(0, ticket.sellIn);
    }

    @Test
    void decreaseSellInUnderZero(){
        Ticket ticket = new Ticket("Elixir of the Mongoose", 0, 7, 2);

        ticket.decreaseSellIn();

        assertEquals(0, ticket.sellIn);
    }

    @Test
    void increaseQuality(){
        Ticket ticket = new Ticket("Elixir of the Mongoose", 0, 20, 2);

        ticket.increaseQuality(1);

        assertEquals(21, ticket.quality);
    }

    @Test
    void increaseQualityLimit(){
        Ticket ticket = new Ticket("Elixir of the Mongoose", 0, 50, 2);

        ticket.increaseQuality(1);

        assertEquals(50, ticket.quality);
    }

    @Test
    void decreaseQualityUnderZero(){
        Ticket ticket = new Ticket("Elixir of the Mongoose", 0, 1, 2);

        ticket.decreaseQuality(2);

        assertEquals(0, ticket.quality);
    }

    @Test
    void decreaseQualityOutOfDate(){
        Ticket ticket = new Ticket("Elixir of the Mongoose", 2, 5, 2);

        ticket.decreaseQuality(1);

        assertEquals(4, ticket.quality);

        ticket = new Ticket("Elixir of the Mongoose", 1, 5, 2);

        ticket.decreaseQuality(1);

        assertEquals(3, ticket.quality);
    }

    @Test
    void decreaseQuality(){
        Ticket ticket = new Ticket("Elixir of the Mongoose", 10, 5, 2);

        ticket.decreaseQuality(1);

        assertEquals(4, ticket.quality);

        ticket.decreaseQuality(2);

        assertEquals(2, ticket.quality);
    }

}
