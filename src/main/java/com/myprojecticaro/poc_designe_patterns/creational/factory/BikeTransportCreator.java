package com.myprojecticaro.poc_designe_patterns.creational.factory;

public class BikeTransportCreator extends TransportCreator {
    @Override
    public Transport createTransport() {
        return new BikeTransport();
    }
}

