package com.myprojecticaro.poc_designe_patterns.structural.adapter;

public class OldPaymentGateway {

    public void makePayment(double amount, String currency) {
        System.out.println("Pagamento processado no sistema ANTIGO:");
        System.out.println("Valor: " + amount + " | Moeda: " + currency);
    }
}

