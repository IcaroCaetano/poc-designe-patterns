package creational.builder.order;

import java.time.LocalDate;
import java.util.List;

public class OnlineOrderBuilder implements OrderBuilder {

    private String customer;
    private List<String> items;
    private double totalPrice;
    private String deliveryAddress;
    private LocalDate deliveryDate;
    private boolean express;

    @Override
    public OrderBuilder setCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    @Override
    public OrderBuilder setItems(List<String> items) {
        this.items = items;
        return this;
    }

    @Override
    public OrderBuilder setTotalPrice(double price) {
        this.totalPrice = price;
        return this;
    }

    @Override
    public OrderBuilder setDeliveryAddress(String address) {
        this.deliveryAddress = address;
        return this;
    }

    @Override
    public OrderBuilder setDeliveryDate(LocalDate date) {
        this.deliveryDate = date;
        return this;
    }

    @Override
    public OrderBuilder setExpress(boolean express) {
        this.express = express;
        return this;
    }

    @Override
    public Order build() {
        return new Order(customer, items, totalPrice, deliveryAddress, deliveryDate, express);
    }
}

