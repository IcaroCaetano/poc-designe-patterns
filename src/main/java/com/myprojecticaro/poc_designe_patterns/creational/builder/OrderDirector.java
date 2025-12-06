package com.myprojecticaro.poc_designe_patterns.creational.builder;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Director class responsible for orchestrating the construction of predefined
 * {@link Order} objects using the Builder pattern.
 *
 * <p>The {@code OrderDirector} encapsulates common order creation workflows,
 * ensuring that clients can obtain complex {@code Order} instances without
 * exposing the step-by-step construction logic.</p>
 *
 * <p>This class is optional in the Builder pattern but useful when the system
 * requires standardized, repeated configurations.</p>
 */
public class OrderDirector {

    /**
     * Creates a basic online order with predefined customer, items, price,
     * delivery address, and standard (non-express) delivery.
     *
     * <p>This method demonstrates a simple order creation workflow where the
     * {@link OrderBuilder} receives default values for a typical online order.</p>
     *
     * @param builder the builder responsible for assembling the {@code Order}
     * @return a fully built {@code Order} instance
     */
    public Order createBasicOnlineOrder(OrderBuilder builder) {
        return builder
                .setCustomer("John Doe")
                .setItems(Arrays.asList("Mouse", "Keyboard"))
                .setTotalPrice(450.0)
                .setDeliveryAddress("Rua das Flores, 123")
                .setDeliveryDate(LocalDate.now().plusDays(3))
                .setExpress(false)
                .build();
    }

    /**
     * Creates an express online order with predefined customer, items, price,
     * delivery address, and express delivery enabled.
     *
     * <p>This configuration is typically used for urgent or premium deliveries
     * and demonstrates how the Director can define alternative building flows.</p>
     *
     * @param builder the builder responsible for assembling the {@code Order}
     * @return a fully built {@code Order} instance with express delivery
     */
    public Order createExpressOnlineOrder(OrderBuilder builder) {
        return builder
                .setCustomer("Ana Silva")
                .setItems(Arrays.asList("Notebook"))
                .setTotalPrice(5500.0)
                .setDeliveryAddress("Av Central, 900")
                .setDeliveryDate(LocalDate.now().plusDays(1))
                .setExpress(true)
                .build();
    }
}
