package com.myprojecticaro.poc_designe_patterns.creational.abstract_factory;

public class PaypalNotificationService implements NotificationService {
    @Override
    public void notifyUser(String message) {
        System.out.println("PayPal notification: " + message);
    }
}

