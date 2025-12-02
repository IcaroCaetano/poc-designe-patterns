package com.myprojecticaro.poc_designe_patterns.behavioral.chain;

public interface Handler {
    Handler setNext(Handler next);
    void handle(Request request);
}

