package creational.builder.order;

import java.time.LocalDate;
import java.util.List;

public class PhysicalStoreOrderBuilder implements OrderBuilder {

    private String customer;
    private List<String> items;
    private double totalPrice;
    private String pickupStore;
    private LocalDate pickupDate;

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
        this.pickupStore = address;
        return this;
    }

    @Override
    public OrderBuilder setDeliveryDate(LocalDate date) {
        this.pickupDate = date;
        return this;
    }

    @Override
    public OrderBuilder setExpress(boolean express) {
        return this;
    }

    @Override
    public Order build() {
        return new Order(customer, items, totalPrice, pickupStore, pickupDate, false);
    }
}

