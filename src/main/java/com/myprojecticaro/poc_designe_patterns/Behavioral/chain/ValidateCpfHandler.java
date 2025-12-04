package com.myprojecticaro.poc_designe_patterns.behavioral.chain;

public class ValidateCpfHandler extends AbstractHandler {

    @Override
    public void handle(Request request) {
        if (request.getCpf() == null || request.getCpf().length() != 11) {
            System.out.println("Invalid CPF!");
            return;
        }
        System.out.println("CPF validated.");
        next(request);
    }
}

