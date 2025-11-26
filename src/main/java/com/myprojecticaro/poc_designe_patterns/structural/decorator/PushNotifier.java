package com.myprojecticaro.poc_designe_patterns.structural.decorator;

public class PushNotifier extends BaseDecorator {

    public PushNotifier(Notifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending PUSH NOTIFICATION: " + message);
    }
}
