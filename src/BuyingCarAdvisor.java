class BuyingCarAdvisor {
    private Dealer[] dealer;
    private Car cheapestCar;
    private Dealer cheapestDealer;

    BuyingCarAdvisor(Dealer[] dealer) {

        this.dealer = dealer;
    }

    void findBestOffer() {
        int cheapest = 10000000;
        for (Dealer dealer1 : dealer) {
            if (dealer1 != null) {
                for (Car car : dealer1.getCar()) {

                    if (car != null) {
                        System.out.print(dealer1.getName());
                        System.out.print(" " + car.getBrand().toUpperCase());
                        System.out.print(" " + car.getModel());
                        System.out.println(" $" + car.getPrice());
                        if (car.getPrice() < cheapest) {
                            cheapest = car.getPrice();
                            cheapestCar = car;
                            cheapestDealer = dealer1;
                        }
                    }
                }
            }
        }
        System.out.println("Najtańszy = " + cheapestCar.getBrand() + " " + cheapestCar.getModel() + " $" + cheapest + " " + cheapestDealer.getName());
    }

}


