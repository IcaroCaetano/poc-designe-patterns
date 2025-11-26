package com.myprojecticaro.poc_designe_patterns.behavioral.strategy.payment;

public class BoletoPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {

        // Simular geração de boleto bancário
        System.out.println("📄 Paying R$ " + amount + " using BOLETO.");
    }
}
