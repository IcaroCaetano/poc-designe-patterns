package com.myprojecticaro.poc_designe_patterns.structural.decorator;

public class SlackNotifier extends BaseDecorator {

    public SlackNotifier(Notifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("💬 Sending SLACK MESSAGE: " + message);
    }
}
