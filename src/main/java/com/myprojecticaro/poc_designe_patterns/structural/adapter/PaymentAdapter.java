package com.myprojecticaro.poc_designe_patterns.structural.adapter;

/**
 * Adapter that allows the new system to interact with the legacy payment gateway.
 *
 * <p>This class implements the {@link PaymentProcessor} interface and internally
 * delegates payment processing to the old API ({@link OldPaymentGateway}),
 * converting the new method call format into the legacy one.</p>
 *
 * <p>In the Adapter Pattern, this class acts as the <strong>Adapter</strong> that
 * enables compatibility between:</p>
 * <ul>
 *     <li>The new system interface ({@code PaymentProcessor}) — the <strong>Target</strong></li>
 *     <li>The legacy implementation ({@code OldPaymentGateway}) — the <strong>Adaptee</strong></li>
 * </ul>
 *
 * <p>Clients of the new system use this adapter without needing to know the legacy API.</p>
 */
public class PaymentAdapter implements PaymentProcessor {

    /**
     * Reference to the legacy payment gateway that will actually process the payment.
     */
    private final OldPaymentGateway legacyGateway;

    /**
     * Creates a new adapter instance that connects the new payment interface
     * with the old payment gateway.
     *
     * @param legacyGateway the existing legacy service to be adapted
     */
    public PaymentAdapter(OldPaymentGateway legacyGateway) {
        this.legacyGateway = legacyGateway;
    }

    /**
     * Processes a payment using the new system interface while internally
     * delegating the request to the old legacy method.
     *
     * <p>A default currency ("BRL") is applied since the new interface does not
     * require currency information but the legacy API does.</p>
     *
     * @param value the payment value to process
     */
    @Override
    public void processPayment(double value) {
        legacyGateway.makePayment(value, "BRL");
    }
}
