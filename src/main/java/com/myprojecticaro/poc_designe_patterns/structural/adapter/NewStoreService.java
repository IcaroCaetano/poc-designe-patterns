package com.myprojecticaro.poc_designe_patterns.structural.adapter;

/**
 * Service class representing the new store system that depends on the modern
 * {@link PaymentProcessor} interface to perform payment operations.
 *
 * <p>This class is used in the Adapter Pattern as the "client" that expects
 * a specific interface ({@code PaymentProcessor}). Legacy systems can be
 * integrated by providing an adapter that implements this interface.</p>
 */
public class NewStoreService {

    private final PaymentProcessor paymentProcessor;

    /**
     * Creates a new instance of {@code NewStoreService} with a required
     * {@link PaymentProcessor} implementation.
     *
     * @param paymentProcessor the payment processor used to handle payments;
     *                         typically an adapter when integrating legacy systems
     */
    public NewStoreService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    /**
     * Executes the checkout process of the new system,
     * delegating the payment handling to the injected
     * {@link PaymentProcessor} implementation.
     *
     * @param price the amount to be charged during checkout
     */
    public void checkout(double price) {
        System.out.println("New system starting checkout...");
        paymentProcessor.processPayment(price);
    }
}
