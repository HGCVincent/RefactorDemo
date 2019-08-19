package gildedRose;

public class NormalItemStrategy extends Item {

    public NormalItemStrategy(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        if (quality > 0){
            quality--;
        }
        sellIn--;
        if (sellIn < 0){
            if (quality > 0){
                quality--;
            }
        }
    }
}
