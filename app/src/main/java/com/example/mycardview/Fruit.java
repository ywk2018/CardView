package com.example.mycardview;

/**
 * class description:
 * author ywk
 * since 2019-06-03
 */
public class Fruit {
    private String fruitName;

    private int fruitImage;

    public Fruit(String fruitName, int fruitImage) {
        this.fruitName = fruitName;
        this.fruitImage = fruitImage;
    }

    public String getFruitName() {
        return fruitName;
    }

    public int getFruitImage() {
        return fruitImage;
    }
}