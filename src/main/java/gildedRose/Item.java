package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void updateItemQuality() {
        switch (name){
            case "Aged Brie":
                new AgedBrieItemStrategy().updateQuality(this);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                new BackstageItemStrategy().updateQuality(this);
                break;
            case "Sulfuras, Hand of Ragnaros":
                new SulfuraItemStrategy().updateQuality(this);
                break;
            default:
                new NormalItemStrategy().updateQuality(this);
                break;
        }
    }
}
