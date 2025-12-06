package com.myprojecticaro.poc_designe_patterns.structural.adapter;

/**
 * Defines the contract for processing payments in the new system.
 *
 * <p>This interface represents the <strong>Target</strong> role in the Adapter Pattern.
 * It defines the modern payment API that the new application expects to work with.</p>
 *
 * <p>Implementations may integrate with external payment services,
 * legacy systems (through an Adapter), or mock components for testing.</p>
 */
public interface PaymentProcessor {

    /**
     * Processes a payment with the specified value.
     *
     * @param value the monetary amount to be processed
     */
    void processPayment(double value);
}
