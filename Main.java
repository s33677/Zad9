import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> Kontener = new ArrayList<>();

        Car car1 = new Car("Toyota Supra", 2006);
        Car car2 = new Car("Nissan Skyline", 2012);
        Car car3 = new Car("BMW M4 Competition", 2024);
        Car car4 = new Car("Audi RS6", 2020);
        Car car5 = new Car("Ford Mustang GT", 2018);
        Car car6 = new Car("Chevrolet Camaro", 2017);
        Car car7 = new Car("Porsche 911", 2022);
        Car car8 = new Car("Mazda RX-7", 2002);
        Car car9 = new Car("Lamborghini Huracan", 2021);
        Car car10 = new Car("Honda Civic Type R", 2019);

        Kontener.add(car1);
        Kontener.add(car2);
        Kontener.add(car3);
        Kontener.add(car4);
        Kontener.add(car5);
        Kontener.add(car6);
        Kontener.add(car7);
        Kontener.add(car8);
        Kontener.add(car9);
        Kontener.add(car10);

        Collections.sort(Kontener);

        for (Car car : Kontener) {
            System.out.println(car);
        }
    }
    NegativeNumberException.fillAray();
}