package creational.factorymethod.transport;

public class BikeTransport implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by BIKE...");
    }
}
