package com.myprojecticaro.poc_designe_patterns.behavioral.memento;

public class TextMemento {

    private final String state;

    public TextMemento(String state) {
        this.state = state;
    }

    protected String getState() {
        return state;
    }
}

