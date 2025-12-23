package com.myprojecticaro.poc_designe_patterns.structural.bridge;

public class TvDevice implements Device {

    @Override
    public void turnOn() {
        System.out.println("TV turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned OFF");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("TV volume set to " + volume);
    }
}

