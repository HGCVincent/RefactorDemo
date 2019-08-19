package gildedRose;

public class AgedBrieItemStrategy extends Item {

    public AgedBrieItemStrategy(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality(){
        qualityLessThan50Handler();
        sellIn--;
        if (sellIn < 0){
            qualityLessThan50Handler();
        }
    }
}
