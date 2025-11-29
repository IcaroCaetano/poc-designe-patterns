package com.myprojecticaro.poc_designe_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class OrderEventSubject implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void newOrderPlaced(String orderId) {
        System.out.println("📦 Pedido criado: " + orderId);
        notifyObservers("New order created: " + orderId);
    }
}
