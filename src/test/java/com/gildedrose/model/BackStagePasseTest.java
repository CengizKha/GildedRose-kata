package com.gildedrose.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackStagePasseTest {

    @Test
    void update(){
        BackStagePasse backStagePasse = new BackStagePasse(7, 10, 1);

        backStagePasse.update();

        assertEquals(6, backStagePasse.sellIn);
        assertEquals(12, backStagePasse.quality);

        backStagePasse.update();

        assertEquals(5, backStagePasse.sellIn);
        assertEquals(15, backStagePasse.quality);
    }

    @Test
    void updateQualitySellInZero(){
        BackStagePasse backStagePasse = new BackStagePasse(0, 0, 1);

        backStagePasse.updateQuality();

        assertEquals(0, backStagePasse.quality);
    }

    @Test
    void updateQualityMaxValue(){
        BackStagePasse backStagePasse = new BackStagePasse(2, 50, 1);

        backStagePasse.updateQuality();

        assertEquals(50, backStagePasse.quality);
    }

    @Test
    void updateQualityLastTenDays(){
        BackStagePasse backStagePasse = new BackStagePasse(6, 2, 1);

        backStagePasse.updateQuality();

        assertEquals(4, backStagePasse.quality);
    }

    @Test
    void updateQualityLastTreeDays(){
        BackStagePasse backStagePasse = new BackStagePasse(5, 2, 1);

        backStagePasse.updateQuality();

        assertEquals(5, backStagePasse.quality);
    }

}
