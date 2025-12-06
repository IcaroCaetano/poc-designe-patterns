package com.myprojecticaro.poc_designe_patterns.behavioral.observer;

public class SmsObserver implements Observer {

    @Override
    public void update(String eventMessage) {
        System.out.println("Sending SMS about event: " + eventMessage);
    }
}
