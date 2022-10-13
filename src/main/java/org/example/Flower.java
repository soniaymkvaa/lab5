package org.example;

import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class Flower {
    @Getter @Setter
    private double sepalLength;
    private FlowerColor color;
    @Getter @Setter
    private double price;

    public String getColor() {
        return color.toString();
    }

}
