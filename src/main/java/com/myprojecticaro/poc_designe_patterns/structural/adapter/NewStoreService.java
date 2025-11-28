package com.myprojecticaro.poc_designe_patterns.structural.adapter;

public class NewStoreService {

    private final PaymentProcessor paymentProcessor;

    public NewStoreService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double price) {
        System.out.println("New system starting checkout...");
        paymentProcessor.processPayment(price);
    }
}

