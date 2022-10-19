package store;

import java.util.ArrayList;
public class FlowerBucket {
    private final ArrayList<FlowerPack> bucket = new ArrayList<>();
    public void add(FlowerPack flowerPack) {
        bucket.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: bucket) {
            price += flowerPack.getPrice();
        }
        return price;
    }

}