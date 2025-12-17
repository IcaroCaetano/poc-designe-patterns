package com.myprojecticaro.poc_designe_patterns.creational.abstract_factory;

public class PaypalFactory implements PaymentAbstractFactory {

    @Override
    public PaymentService createPaymentService() {
        return new PaypalPaymentService();
    }

    @Override
    public NotificationService createNotificationService() {
        return new PaypalNotificationService();
    }
}

