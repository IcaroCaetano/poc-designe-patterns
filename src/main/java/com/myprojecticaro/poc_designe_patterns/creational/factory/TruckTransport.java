package creational.factorymethod.transport;

public class TruckTransport implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by TRUCK...");
    }
}
