package gildedRose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {
    @Test
    public void should_return_AgedBrie_1_50_when_invoke_updateQuality_given_AgedBrie_0_50() {
        Item item = new Item("Aged Brie",1,50);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals("Aged Brie, 0, 50",gildedRose.items[0].toString());
    }

    @Test
    public void should_return_AgedBrie_0_50_when_invoke_updateQuality_given_AgedBrie_negative_1_50() {
        Item item = new Item("Aged Brie",0,50);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals("Aged Brie, -1, 50",gildedRose.items[0].toString());
    }

    @Test
    public void should_return_AgedBrie_0_49_when_invoke_updateQuality_given_AgedBrie_0_50() {
        Item item = new Item("Aged Brie",0,48);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals("Aged Brie, -1, 50",gildedRose.items[0].toString());
    }

    @Test
    public void should_return_Backstage_1_50_when_invoke_updateQuality_given_Backstage_0_49() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",1,49);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 50",gildedRose.items[0].toString());
    }

    @Test
    public void should_return_Backstage_1_50_when_invoke_updateQuality_given_Backstage_1_47() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",1,47);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 50",gildedRose.items[0].toString());
    }

    @Test
    public void should_return_Backstage_negative_1_0_when_invoke_updateQuality_given_Backstage_0_47() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",0,47);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0",gildedRose.items[0].toString());
    }

    @Test
    public void should_return_Backstage_10_48_when_invoke_updateQuality_given_Backstage_11_47() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",11,47);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 10, 48",gildedRose.items[0].toString());
    }

    @Test
    public void should_return_Backstage___when_invoke_updateQuality_given_Backstage_9_47() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",9,47);
        Item[] items = {item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 8, 49",gildedRose.items[0].toString());
    }
}
