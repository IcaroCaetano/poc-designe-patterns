package com.myprojecticaro.poc_designe_patterns.structural.facade;

/**
 * Facade that simplifies the process of placing an order by
 * coordinating multiple internal subsystems such as payment,
 * inventory, and shipping.
 */
public class OrderFacade {

    private final PaymentService paymentService;
    private final InventoryService inventoryService;
    private final ShippingService shippingService;

    public OrderFacade() {
        this.paymentService = new PaymentService();
        this.inventoryService = new InventoryService();
        this.shippingService = new ShippingService();
    }

    /**
     * High-level method that executes an entire order workflow.
     */
    public void placeOrder(String customer, String item, double price) {

        System.out.println("Starting order process...");

        if (!inventoryService.checkStock(item)) {
            System.out.println("Item out of stock!");
            return;
        }

        paymentService.processPayment(customer, price);
        inventoryService.reserveItem(item);
        shippingService.scheduleDelivery(item);

        System.out.println("Order completed successfully!");
    }
}

