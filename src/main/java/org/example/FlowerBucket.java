package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter@Setter
public class FlowerBucket {
    List<FlowerPack> bucket = new ArrayList<FlowerPack>();
    public void add(FlowerPack flowerPack) {
        bucket.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        if (bucket.size() != 0) {
            for (int i = 0; i < bucket.size(); i++) {
                price += bucket.get(i).getPrice();
            }
        } else {
            return 0.0;
        }
        return price;
    }
}
