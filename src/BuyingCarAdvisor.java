class BuyingCarAdvisor {
    private Dealer[] dealer = new Dealer[10];

    BuyingCarAdvisor(Dealer[] dealer) {
        this.dealer = dealer;
    }

    void findBestOffer() {
        for (Dealer dealer1 : dealer) {
            if (dealer1 != null) {
                for (Car car : dealer1.car) {

                    if (car != null) {
                        System.out.println(car.brand.toUpperCase());
                        System.out.println(car.getPrice());
                    }
                }
            }
        }

    }

}


