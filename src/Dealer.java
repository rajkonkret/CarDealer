class Dealer {
    private Car[] car;
    private String address;
    private String name;

    Dealer(Car[] car, String address, String name) {
        this.car = car;
        this.address = address;
        this.name = name;
    }

    Car[] getCar() {
        return car;
    }

    String getAddress() {
        return address;
    }

    String getName() {
        return name;
    }
}
