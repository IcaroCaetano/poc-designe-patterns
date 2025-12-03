package com.myprojecticaro.poc_designe_patterns.behavioral.chain;

public class FinalApprovalHandler extends AbstractHandler {

    @Override
    public void handle(Request request) {
        if (!request.isDocumentValid() || request.getFraudScore() > 70) {
            System.out.println("Request rejected due to risk."");
        } else {
            System.out.println("Order successfully approved!");
        }
    }
}

