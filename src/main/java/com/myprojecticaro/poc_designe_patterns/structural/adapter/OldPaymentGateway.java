package com.myprojecticaro.poc_designe_patterns.structural.adapter;

public class OldPaymentGateway {

    public void makePayment(double amount, String currency) {
        System.out.println("Payment processed in the OLD system:");
        System.out.println("Value: " + amount + " | Currency: " + currency);
    }
}

