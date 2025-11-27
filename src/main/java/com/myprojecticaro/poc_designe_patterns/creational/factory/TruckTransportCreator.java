package creational.factorymethod.transport;

public class TruckTransportCreator extends TransportCreator {
    @Override
    public Transport createTransport() {
        return new TruckTransport();
    }
}

