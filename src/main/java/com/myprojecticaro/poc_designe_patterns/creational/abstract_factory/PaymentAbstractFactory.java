package com.myprojecticaro.poc_designe_patterns.creational.abstract_factory;

public interface PaymentAbstractFactory {

    PaymentService createPaymentService();

    NotificationService createNotificationService();
}

