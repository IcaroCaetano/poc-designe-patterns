package com.myprojecticaro.poc_designe_patterns.structural.flyweight;

public class Circle implements Shape {

    private final String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println(
            "Drawing Circle [color=" + color + ", x=" + x + ", y=" + y + "]"
        );
    }
}

