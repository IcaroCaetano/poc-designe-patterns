package com.myprojecticaro.poc_designe_patterns.behavioral.chain;

public class ValidateCpfHandler extends AbstractHandler {

    @Override
    public void handle(Request request) {
        if (request.getCpf() == null || request.getCpf().length() != 11) {
            System.out.println("❌ CPF inválido!");
            return; // para a cadeia
        }
        System.out.println("✔ CPF validado.");
        next(request);
    }
}

