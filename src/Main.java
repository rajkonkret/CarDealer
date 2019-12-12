public class Main {
//    Stworzyć doradcę kupna samochodu,
//    którego celem będzie znalezienie najtańszej oferty spośród kilku dealerów samochodowych.
//    W tym celu:1.Stworzyć klasę Car zawierającą:-brand-model-price
//    2.Stworzyćklasę Dealer zawierającą pola:-name-adress-tablicę obiektów Car
//    3.Stworzyć klasę BuyingCarAdvisor, która zawierać będzie
//    -tablicę obiektów Dealer[]
//    -konstruktor przyjmujący Dealer[]
//    -metodę findBestOffer(), która znajdzie i zwróci najtańszy samochód spośród wszystkich dealerów.
//    4.W nowej klasie napisać metodę mainw taki sposób by:
//    a.tworzyła przykładowe samochody
//    b.tworzyła przykładowych dealerów
//    c.tworzyła obiekt BuyingCarAdvisor
//    d.wywoływała metodę findBestOffer()
//    e.wypisywała najlepszą ofertę
//    Sugeruję by najtańszym autem okazał się.... Fiat Panda.

    public static void main(String[] args) {
        Car[] cars = new Car[4];
        Car[] cars1 = new Car[4];
        Car[] cars2 = new Car[4];
        Dealer[] dealers = new Dealer[3];

        Car car = new Car("bmw", "750", 10000);
        Car car2 = new Car("bmw", "850", 15000);
        Car car1 = new Car("bmw", "116", 7500);
        Car car3 = new Car("Dacia", "Sandero", 3500);
        cars[0] = car;
        cars[1] = car2;

        cars1[0] = car;
        cars1[1] = car2;
        cars1[2] = car1;

        cars2[0] = car;
        cars2[1] = car2;
        cars2[2] = car1;
        cars2[3] = car3;

        Dealer dealer = new Dealer(cars, "lodz", "RajKonkret");
        Dealer dealer2 = new Dealer(cars1, "lodz", "Concept");
        Dealer dealer3 = new Dealer(cars2, "WWA", "TYSIAK");
        dealers[0] = dealer;
        dealers[1] = dealer2;
        dealers[2] = dealer3;

        cars = dealer.getCar();
        car = cars[0];

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        BuyingCarAdvisor buyingCarAdvisor = new BuyingCarAdvisor(dealers);
        buyingCarAdvisor.findBestOffer();
        buyingCarAdvisor.findBestOfferTwo();
    }
}
