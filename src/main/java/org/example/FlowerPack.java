package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        setFlower(flower);
        setQuantity(quantity);
    }

    public double getPrice() {
        return flower.getPrice()*quantity;
    }
}
