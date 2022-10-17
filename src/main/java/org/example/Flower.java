package org.example;

import lombok.Getter;
import lombok.Setter;


@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType FlowerType;

    public String getColor() {
        return color.toString();
    }

}
