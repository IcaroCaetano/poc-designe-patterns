package com.myprojecticaro.poc_designe_patterns.creational.abstractfactory;

public class StripeNotificationService implements NotificationService {
    @Override
    public void notifyUser(String message) {
        System.out.println("Stripe notification: " + message);
    }
}

