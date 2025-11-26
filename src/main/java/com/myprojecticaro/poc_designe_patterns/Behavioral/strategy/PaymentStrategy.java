package com.myprojecticaro.poc_designe_patterns.behavioral.strategy.payment;

public interface PaymentStrategy {

    /**
     * Executes a payment using a specific payment method.
     *
     * @param amount amount to charge
     */
    void pay(double amount);
}
