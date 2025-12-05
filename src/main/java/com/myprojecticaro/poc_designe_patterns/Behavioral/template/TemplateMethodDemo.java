package com.myprojecticaro.poc_designe_patterns.behavioral.template_method;

public class TemplateMethodDemo {

    public static void main(String[] args) {

        Request request = new Request();

        System.out.println("---- BASIC FRAUD CHECK ----");
        AbstractFraudCheck basic = new BasicFraudCheck();
        basic.process(request);

        System.out.println("\n---- ADVANCED FRAUD CHECK ----");
        AbstractFraudCheck advanced = new AdvancedFraudCheck();
        advanced.process(request);
    }
}

