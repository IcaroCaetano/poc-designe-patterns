package com.myprojecticaro.poc_designe_patterns.structural.bridge;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void powerOn() {
        device.turnOn();
    }

    @Override
    public void powerOff() {
        device.turnOff();
    }

    public void mute() {
        device.setVolume(0);
    }
}

