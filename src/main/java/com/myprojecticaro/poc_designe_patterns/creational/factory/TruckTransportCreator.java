package com.myprojecticaro.poc_designe_patterns.creational.factory;

public class TruckTransportCreator extends TransportCreator {
    @Override
    public Transport createTransport() {
        return new TruckTransport();
    }
}

