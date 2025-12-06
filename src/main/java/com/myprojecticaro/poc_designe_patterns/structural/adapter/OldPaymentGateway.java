package com.myprojecticaro.poc_designe_patterns.structural.adapter;

/**
 * Legacy payment gateway representing the old system API.
 *
 * <p>This class simulates an outdated payment provider that uses a different
 * method signature and requires additional parameters, making it incompatible
 * with the new application interface ({@code PaymentProcessor}).</p>
 *
 * <p>In the Adapter Pattern, this class plays the role of the <strong>Adaptee</strong>,
 * meaning it contains the existing behavior that must be adapted to the new system.</p>
 */
public class OldPaymentGateway {

    /**
     * Processes a payment using the legacy system format.
     *
     * @param amount   the amount to be charged
     * @param currency the currency format required by the old API
     */
    public void makePayment(double amount, String currency) {
        System.out.println("Payment processed in the OLD system:");
        System.out.println("Value: " + amount + " | Currency: " + currency);
    }
}
