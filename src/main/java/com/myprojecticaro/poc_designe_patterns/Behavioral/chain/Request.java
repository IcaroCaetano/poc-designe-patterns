package com.myprojecticaro.poc_designe_patterns.behavioral.chain;

public class Request {
    
    private final String cpf;
    private boolean documentValid;
    private int fraudScore;

    public Request(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean isDocumentValid() {
        return documentValid;
    }

    public void setDocumentValid(boolean documentValid) {
        this.documentValid = documentValid;
    }

    public int getFraudScore() {
        return fraudScore;
    }

    public void setFraudScore(int fraudScore) {
        this.fraudScore = fraudScore;
    }
}

