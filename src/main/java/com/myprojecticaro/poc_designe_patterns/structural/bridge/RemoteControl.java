package com.myprojecticaro.poc_designe_patterns.structural.bridge;

public abstract class RemoteControl {

    protected Device device;

    protected RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void powerOn();
    public abstract void powerOff();
}

