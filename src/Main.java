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
        Car[] cars = new Car[10];
        Car[] cars1 = new Car[10];
        Dealer[] dealers = new Dealer[10];

        Car car = new Car("bmw", "750", 10000);
        Car car2 = new Car("bmw", "850", 15000);
        Car car1 = new Car("bmw", "116", 7500);
        cars[0] = car;
        cars[1] = car2;

        cars1[0] = car;
        cars1[1] = car2;
        cars1[2] = car1;


        Dealer dealer = new Dealer(cars, "lodz", "RajKonkret");
        Dealer dealer2 = new Dealer(cars1, "lodz", "concept");
        dealers[0] = dealer;
        dealers[1] = dealer2;

        cars = dealer.getCar();
        car = cars[0];

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        BuyingCarAdvisor buyingCarAdvisor = new BuyingCarAdvisor(dealers);
        buyingCarAdvisor.findBestOffer();
    }
}
