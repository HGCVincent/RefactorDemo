package gildedRose;

public class BackstageItem extends Item {
    public BackstageItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality(){
        if (quality < 50){
            quality++;
            if (sellIn < 11){
                qualityLessThan50Handler();
            }
            if (sellIn < 6){
                qualityLessThan50Handler();
            }
        }
        sellIn--;
        if (sellIn < 0){
            quality = 0;
        }
    }
}
