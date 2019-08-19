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
}
