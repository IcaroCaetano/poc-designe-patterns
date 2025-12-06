package com.myprojecticaro.poc_designe_patterns.behavioral.observer;

public class FraudAnalysisObserver implements Observer {

    @Override
    public void update(String eventMessage) {
        System.out.println("Running FRAUD ANALYSIS for event: " + eventMessage);
    }
}

