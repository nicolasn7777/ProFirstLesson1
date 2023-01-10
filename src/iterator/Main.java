package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> al = new ArrayList<>();

        al.add(new Car(1000, "BMW"));
        al.add(new Car(2000, "Lexus"));
        al.add(new Car(3000, "Opel"));
        al.add(new Car(4000, "Ford"));
        al.add(new Car(5000, "Fiat"));
        al.add(new Car(6000, "Seat"));
        al.add(new Car(7000, "Ferrari"));
        al.add(new Car(8000, "Mercedes"));
        al.add(new Car(9000, "Porsche"));
        al.add(new Car(9999, "Mazda"));

        Iterator<Car> carIterator = al.iterator();
        while (carIterator.hasNext()) {
            Car temp = carIterator.next();
        }
        System.out.println(al);
    }
}

class Car {
    int price;
    String model;

    Car(int price, String model) {
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return this.price + " " + this.model;
    }
}
