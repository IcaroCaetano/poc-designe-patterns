package com.myprojecticaro.poc_designe_patterns.creational.abstract_factory;

public class StripeFactory implements PaymentAbstractFactory {

    @Override
    public PaymentService createPaymentService() {
        return new StripePaymentService();
    }

    @Override
    public NotificationService createNotificationService() {
        return new StripeNotificationService();
    }
}

