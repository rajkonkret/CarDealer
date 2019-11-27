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
        Dealer[] dealers = new Dealer[10];

        Car car = new Car("bmw", "750", 10000);
        Car car2 = new Car("bmw", "850", 15000);
        cars[0] = car;
        cars[1] = car2;
        Dealer dealer = new Dealer(cars, "lodz", "RajKonkret");
        dealers[0] = dealer;

        cars = dealer.getCar();
        car = cars[0];

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        BuyingCarAdvisor buyingCarAdvisor = new BuyingCarAdvisor(dealers);
        buyingCarAdvisor.findBestOffer();
    }
}
