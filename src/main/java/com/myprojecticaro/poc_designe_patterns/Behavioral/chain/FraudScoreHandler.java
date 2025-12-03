package com.myprojecticaro.poc_designe_patterns.behavioral.chain;

import java.util.Random;

public class FraudScoreHandler extends AbstractHandler {

    @Override
    public void handle(Request request) {
        int score = new Random().nextInt(100);
        request.setFraudScore(score);
        System.out.println("Fraud score calculated:" + score);
        next(request);
    }
}

