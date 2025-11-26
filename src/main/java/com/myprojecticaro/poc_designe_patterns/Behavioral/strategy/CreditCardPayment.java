package com.myprojecticaro.poc_designe_patterns.behavioral.strategy.payment;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {

        System.out.println("Paying R$ " + amount + " using Credit Card.");
    }
}
