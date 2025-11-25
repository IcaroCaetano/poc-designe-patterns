package com.myprojecticaro.poc_designe_patterns.structural.decorator;

public class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("📧 Sending EMAIL: " + message);
    }
}
