package com.myprojecticaro.poc_designe_patterns.behavioral.memento;

import java.util.Stack;

public class History {

    private final Stack<TextMemento> history = new Stack<>();

    public void save(TextMemento memento) {
        history.push(memento);
    }

    public TextMemento undo() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}

