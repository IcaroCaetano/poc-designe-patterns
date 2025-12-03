package com.myprojecticaro.poc_designe_patterns.behavioral.chain;

public class ValidateDocumentHandler extends AbstractHandler {

    @Override
    public void handle(Request request) {
        request.setDocumentValid(true);
        System.out.println("Document validated.");
        next(request);
    }
}

