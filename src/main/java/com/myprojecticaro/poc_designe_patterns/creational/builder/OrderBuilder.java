package creational.builder.order;

import java.time.LocalDate;
import java.util.List;

public interface OrderBuilder {

    OrderBuilder setCustomer(String customer);

    OrderBuilder setItems(List<String> items);

    OrderBuilder setTotalPrice(double price);

    OrderBuilder setDeliveryAddress(String address);

    OrderBuilder setDeliveryDate(LocalDate date);

    OrderBuilder setExpress(boolean express);

    Order build();
}

