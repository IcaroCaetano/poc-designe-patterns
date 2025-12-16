package com.myprojecticaro.poc_designe_patterns.creational.singleton;

public class ClassicSingleton {

    private static ClassicSingleton instance;

    private ClassicSingleton() {
    }

    public static synchronized ClassicSingleton getInstance() {
        if (instance == null) {
            instance = new ClassicSingleton();
        }
        return instance;
    }
}
