package com.myprojecticaro.poc_designe_patterns.creational.factory;

public abstract class TransportCreator {

    public abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
