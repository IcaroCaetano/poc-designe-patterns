package creational.builder.order;

import java.time.LocalDate;
import java.util.Arrays;

public class OrderDirector {

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

