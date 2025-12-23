package com.myprojecticaro.poc_designe_patterns.structural.bridge;

public class RadioDevice implements Device {

    @Override
    public void turnOn() {
        System.out.println("Radio turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio turned OFF");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Radio volume set to " + volume);
    }
}

