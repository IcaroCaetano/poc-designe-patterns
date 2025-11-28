package com.myprojecticaro.poc_designe_patterns.structural.adapter;

public class PaymentAdapter implements PaymentProcessor {

    private final OldPaymentGateway legacyGateway;

    public PaymentAdapter(OldPaymentGateway legacyGateway) {
        this.legacyGateway = legacyGateway;
    }

    @Override
    public void processPayment(double value) {
        // Adaptando para o formato esperado pelo sistema antigo
        legacyGateway.makePayment(value, "BRL");
    }
}
