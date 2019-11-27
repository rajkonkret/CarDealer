public class Dealer {
    private Car car[] = new Car[100];
    private String address;
    private String name;

    public Dealer(Car[] car, String address, String name) {
        this.car = car;
        this.address = address;
        this.name = name;
    }
}
