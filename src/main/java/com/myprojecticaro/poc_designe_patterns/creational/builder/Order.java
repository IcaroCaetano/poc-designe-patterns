package com.myprojecticaro.poc_designe_patterns.creational.builder;

import java.time.LocalDate;
import java.util.List;

/**
 * Represents a finalized order created using the Builder pattern.
 *
 * <p>This class is an immutable-like data holder (despite not being declared as immutable)
 * containing all information related to a customer's order, including:
 * customer data, list of purchased items, total price, delivery details, and
 * whether the order is express.</p>
 *
 * <p>Instances of this class are typically constructed using the
 * {@link OnlineOrderBuilder} to ensure a fluent and controlled creation process.</p>
 */
public class Order {

    private String customer;
    private List<String> items;
    private double totalPrice;
    private String deliveryAddress;
    private LocalDate deliveryDate;
    private boolean express;

    /**
     * Creates a new {@code Order} with all required data.
     *
     * @param customer        name of the customer placing the order
     * @param items           list of item names included in the purchase
     * @param totalPrice      total price of the order
     * @param deliveryAddress address where the order should be delivered
     * @param deliveryDate    expected delivery date
     * @param express         {@code true} if the order uses express delivery, {@code false} otherwise
     */
    public Order(String customer, List<String> items, double totalPrice,
                 String deliveryAddress, LocalDate deliveryDate, boolean express) {
        this.customer = customer;
        this.items = items;
        this.totalPrice = totalPrice;
        this.deliveryAddress = deliveryAddress;
        this.deliveryDate = deliveryDate;
        this.express = express;
    }

    /**
     * Returns a formatted string containing all order information.
     *
     * @return a multi-line formatted string representation of the order
     */
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
