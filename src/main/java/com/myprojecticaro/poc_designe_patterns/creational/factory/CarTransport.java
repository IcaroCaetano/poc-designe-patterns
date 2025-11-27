package com.myprojecticaro.poc_designe_patterns.creational.factory;

public class CarTransport implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by CAR...");
    }
}
