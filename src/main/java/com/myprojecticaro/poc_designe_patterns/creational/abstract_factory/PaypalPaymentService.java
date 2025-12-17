package com.myprojecticaro.poc_designe_patterns.creational.abstract_factory;

public class PaypalPaymentService implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using PayPal");
    }
}
