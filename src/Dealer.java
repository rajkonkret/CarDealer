public class Dealer {
    Car car[] = new Car[100];
    String address;
    String name;

    public Dealer(Car[] car, String address, String name) {
        this.car = car;
        this.address = address;
        this.name = name;
    }
}
