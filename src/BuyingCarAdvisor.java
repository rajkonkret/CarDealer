class BuyingCarAdvisor {
    private Dealer[] dealer;
    private Car cheapestCar;

    BuyingCarAdvisor(Dealer[] dealer) {
        this.dealer = dealer;
    }

    void findBestOffer() {
        int cheapest = 10000000;
        for (Dealer dealer1 : dealer) {
            if (dealer1 != null) {
                for (Car car : dealer1.getCar()) {

                    if (car != null) {
                        System.out.println(dealer1.getName());
                        System.out.println(car.getBrand().toUpperCase());
                        System.out.println(car.getModel());
                        System.out.println("$" + car.getPrice());
                        if (car.getPrice() < cheapest) {
                            cheapest = car.getPrice();
                            cheapestCar = car;
                        }
                    }
                }
            }
        }
        System.out.println("Najtańszy = " +cheapestCar.getBrand()+" "+cheapestCar.getModel()+" $"+cheapest);
    }

}


