package creational.factorymethod.transport;

public abstract class TransportCreator {

    // Factory Method
    public abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
