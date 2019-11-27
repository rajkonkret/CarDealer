import java.util.Arrays;

public class Main {
//    Stworzyć doradcę kupna samochodu,
//    którego celem będzie znalezienie najtańszej oferty spośród kilku dealerów samochodowych.
//    W tym celu:1.Stworzyć klasę Car zawierającą:-brand-model-price
//    2.Stworzyćklasę Dealer zawierającą pola:-name-adress-tablicę obiektów Car
//    3.Stworzyć klasę BuyingCarAdvisor, która zawierać będzie
//    -tablicę obiektów Dealer[]
//    -konstruktor przyjmujący Dealer[]
//    -metodę findBestOffer(), która znajdzie i zwróci najtańszy samochód spośród wszystkich dealerów.
//    4.W nowej klasie napisać metodę mainw taki sposób by:a.tworzyła przykładowe samochody
//    b.tworzyła przykładowych dealerów
//    c.tworzyła obiekt BuyingCarAdvisor
//    d.wywoływała metodę findBestOffer()
//    e.wypisywała najlepszą ofertę
//    Sugeruję by najtańszym autem okazał się.... Fiat Panda.

    public static void main(String[] args) {
        Car[] cars = new Car[10];
        Dealer[] dealers=new   Dealer[10];
        Car car = new Car("bmw", "750", 10000);
        cars[0] = car;
        Dealer dealer = new Dealer(cars, "lodz", "RajKonkret");
        car = dealer.car[0];

        System.out.println(car.getBrand());
        dealers[0]=dealer;
        BuyingCarAdvisor buyingCarAdvisor = new BuyingCarAdvisor(dealers);
        buyingCarAdvisor.findBestOffer();
    }
}
