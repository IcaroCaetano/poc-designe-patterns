package com.myprojecticaro.poc_designe_patterns.behavioral.template_method;

public class AdvancedFraudCheck extends AbstractFraudCheck {

    @Override
    protected void specificValidation(Request request) {
        System.out.println("Advanced validation: running biometrics & device fingerprinting…");
    }

    @Override
    protected void calculateRiskScore(Request request) {
        System.out.println("Calculating advanced risk score using ML…");
        request.setFraudScore(85); // risco alto
    }
}

