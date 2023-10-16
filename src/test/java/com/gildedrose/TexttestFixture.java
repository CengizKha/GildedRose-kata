package com.gildedrose;

import com.gildedrose.model.*;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Ticket[] items = new Ticket[] {
                new Ticket("+5 Dexterity Vest", 10, 20, 3), //
                new AgedBrie( 2, 0, 1), //
                new Ticket("Elixir of the Mongoose", 5, 7, 2), //
                new Sulfuras( 0, 80), //
                new Sulfuras(-1, 80),
                new BackStagePasse( 15, 20, 0),
                new BackStagePasse( 10, 49, 0),
                new BackStagePasse( 5, 49, 0),
                new Conjured( 3, 6, 0)
        };

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
