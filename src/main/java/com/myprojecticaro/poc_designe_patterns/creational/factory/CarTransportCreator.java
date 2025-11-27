package creational.factorymethod.transport;

public class CarTransportCreator extends TransportCreator {
    @Override
    public Transport createTransport() {
        return new CarTransport();
    }
}
