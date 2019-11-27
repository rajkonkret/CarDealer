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

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
