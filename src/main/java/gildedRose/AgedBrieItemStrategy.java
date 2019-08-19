package gildedRose;

public class AgedBrieItemStrategy {

    public void updateQuality(Item item){
        if (item.quality < 50){
            item.quality++;
        }
        item.sellIn--;
        if (item.sellIn < 0){
            if (item.quality < 50){
                item.quality++;
            }
        }
    }
}
