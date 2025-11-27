package creational.factorymethod.transport;

public class BikeTransportCreator extends TransportCreator {
    @Override
    public Transport createTransport() {
        return new BikeTransport();
    }
}

