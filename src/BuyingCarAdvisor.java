class BuyingCarAdvisor {
    private Dealer[] dealer;

    BuyingCarAdvisor(Dealer[] dealer) {
        this.dealer = dealer;
    }

    void findBestOffer() {
        for (Dealer dealer1 : dealer) {
            if (dealer1 != null) {
                for (Car car : dealer1.getCar()) {

                    if (car != null) {
                        System.out.println(car.getBrand().toUpperCase());
                        System.out.println(car.getModel());
                        System.out.println("$" + car.getPrice());
                    }
                }
            }
        }

    }

}


