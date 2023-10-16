package com.gildedrose.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SulfurasTest {

    @Test
    void update(){
        Sulfuras sulfuras = new Sulfuras(2, 80);

        sulfuras.update();

        assertEquals(1, sulfuras.sellIn);
        assertEquals(80, sulfuras.quality);

        sulfuras.update();

        assertEquals(0, sulfuras.sellIn);
        assertEquals(80, sulfuras.quality);

        sulfuras.update();

        assertEquals(0, sulfuras.sellIn);
        assertEquals(80, sulfuras.quality);
    }

}
