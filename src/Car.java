class Car {
    public String brand;
    private String model;
    private int price;

    Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    int getPrice() {
        return price;
    }
}
