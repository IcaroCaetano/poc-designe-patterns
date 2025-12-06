package com.myprojecticaro.poc_designe_patterns.behavioral.observer;

public class EmailObserver implements Observer {

    @Override
    public void update(String eventMessage) {
        System.out.println("Sending EMAIL about event: " + eventMessage);
    }
}
