package com.myprojecticaro.poc_designe_patterns.creational.builder;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private String customer;
    private List<String> items;
    private double totalPrice;
    private String deliveryAddress;
    private LocalDate deliveryDate;
    private boolean express;

    public Order(String customer, List<String> items, double totalPrice,
                 String deliveryAddress, LocalDate deliveryDate, boolean express) {
        this.customer = customer;
        this.items = items;
        this.totalPrice = totalPrice;
        this.deliveryAddress = deliveryAddress;
        this.deliveryDate = deliveryDate;
        this.express = express;
    }

    @Override
    public String toString() {
        return """
                Order{
                    customer='%s',
                    items=%s,
                    totalPrice=%.2f,
                    deliveryAddress='%s',
                    deliveryDate=%s,
                    express=%s
                }
                """.formatted(customer, items, totalPrice, deliveryAddress, deliveryDate, express);
    }
}

