package com.myprojecticaro.poc_designe_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static final Map<String, Shape> circleCache = new HashMap<>();

    public static Shape getCircle(String color) {
        return circleCache.computeIfAbsent(color, Circle::new);
    }
}

