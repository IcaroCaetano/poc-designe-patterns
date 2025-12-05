package com.myprojecticaro.poc_designe_patterns.behavioral.template_method;

public class BasicFraudCheck extends AbstractFraudCheck {

    @Override
    protected void specificValidation(Request request) {
        System.out.println("Basic validation: checking CPF format…");
    }

    @Override
    protected void calculateRiskScore(Request request) {
        System.out.println("Calculating basic fraud score…");
        request.setFraudScore(30); // baixo risco
    }
}

