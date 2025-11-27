package creational.factory;

public class CarTransport implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by CAR...");
    }
}
