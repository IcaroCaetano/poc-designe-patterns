package com.myprojecticaro.poc_designe_patterns.creational.builder;

import java.time.LocalDate;
import java.util.List;

/**
 * Concrete implementation of the {@link OrderBuilder} interface used to
 * construct {@link Order} objects through a fluent and step-by-step API.
 *
 * <p>
 * This class represents a builder specialized for online orders,
 * allowing clients to configure various details such as customer
 * information, items purchased, pricing, delivery options, and urgency.
 * </p>
 *
 * <p>
 * The Builder pattern helps avoid telescoping constructors and improves
 * readability when creating complex objects with many optional fields.
 * </p>
 *
 * <p><b>Example usage:</b></p>
 * <pre>
 *     Order order = new OnlineOrderBuilder()
 *             .setCustomer("John Doe")
 *             .setItems(List.of("Laptop", "Mouse"))
 *             .setTotalPrice(2500.00)
 *             .setDeliveryAddress("123 Main St")
 *             .setDeliveryDate(LocalDate.now().plusDays(3))
 *             .setExpress(true)
 *             .build();
 * </pre>
 *
 * @see Order
 * @see OrderBuilder
 * @author Icaro
 * @version 1.0
 */
public class OnlineOrderBuilder implements OrderBuilder {

    private String customer;
    private List<String> items;
    private double totalPrice;
    private String deliveryAddress;
    private LocalDate deliveryDate;
    private boolean express;

    /**
     * Sets the customer name for the order.
     *
     * @param customer the customer placing the order
     * @return the current builder instance
     */
    @Override
    public OrderBuilder setCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    /**
     * Sets the list of items included in the order.
     *
     * @param items the products or services purchased
     * @return the current builder instance
     */
    @Override
    public OrderBuilder setItems(List<String> items) {
        this.items = items;
        return this;
    }

    /**
     * Sets the total price for the order.
     *
     * @param price the final calculated price
     * @return the current builder instance
     */
    @Override
    public OrderBuilder setTotalPrice(double price) {
        this.totalPrice = price;
        return this;
    }

    /**
     * Sets the delivery address for the order.
     *
     * @param address the physical destination for delivery
     * @return the current builder instance
     */
    @Override
    public OrderBuilder setDeliveryAddress(String address) {
        this.deliveryAddress = address;
        return this;
    }

    /**
     * Sets the expected delivery date.
     *
     * @param date the date when the order should be delivered
     * @return the current builder instance
     */
    @Override
    public OrderBuilder setDeliveryDate(LocalDate date) {
        this.deliveryDate = date;
        return this;
    }

    /**
     * Defines whether the order should be processed as express delivery.
     *
     * @param express {@code true} for express shipping, {@code false} otherwise
     * @return the current builder instance
     */
    @Override
    public OrderBuilder setExpress(boolean express) {
        this.express = express;
        return this;
    }

    /**
     * Creates a fully constructed {@link Order} instance with all values
     * supplied to the builder.
     *
     * @return a new immutable {@link Order} object
     */
    @Override
    public Order build() {
        return new Order(customer, items, totalPrice, deliveryAddress, deliveryDate, express);
    }
}
