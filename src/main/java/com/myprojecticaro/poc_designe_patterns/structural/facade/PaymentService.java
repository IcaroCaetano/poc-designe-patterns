package com.myprojecticaro.poc_designe_patterns.structural.facade;

public class PaymentService {
    public void processPayment(String customer, double amount) {
        System.out.println("Payment processed for customer " + customer + " amount: " + amount);
    }
}
