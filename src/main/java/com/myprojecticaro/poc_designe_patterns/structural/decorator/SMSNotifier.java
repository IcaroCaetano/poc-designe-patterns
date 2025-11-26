package com.myprojecticaro.poc_designe_patterns.structural.decorator;

public class SMSNotifier extends BaseDecorator {

    public SMSNotifier(Notifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending SMS: " + message);
    }
}
