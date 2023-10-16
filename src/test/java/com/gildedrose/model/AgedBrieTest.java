package com.gildedrose.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AgedBrieTest {

    @Test
    void update(){
        AgedBrie agedBrie = new AgedBrie(3, 0, 1);

        agedBrie.update();

        assertEquals(2, agedBrie.sellIn);
        assertEquals(1, agedBrie.quality);

        agedBrie.update();

        assertEquals(1, agedBrie.sellIn);
        assertEquals(2, agedBrie.quality);
    }

}
