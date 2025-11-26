package com.myprojecticaro.poc_designe_patterns.behavioral.strategy.payment;

public class PaymentContext {

    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Payment strategy not defined!");
        }
        strategy.pay(amount);
    }
}
