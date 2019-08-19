package gildedRose;

public class NormalItemStrategy {

    public void updateQuality(Item item) {
        if (item.quality > 0){
            item.quality--;
        }
        item.sellIn--;
        if (item.sellIn < 0){
            if (item.quality > 0){
                item.quality--;
            }
        }
    }
}
