package com.gildedrose.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConjuredTest {

    @Test
    void update(){
        Conjured conjured = new Conjured(6, 10, 5);

        conjured.update();

        assertEquals(5, conjured.sellIn);
        assertEquals(8, conjured.quality);

        conjured.update();

        assertEquals(4, conjured.sellIn);
        assertEquals(4, conjured.quality);
    }



}
