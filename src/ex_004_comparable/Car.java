package ex_004_comparable;

public class Car implements Comparable {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    public int compareTo(Object o) {
        int temp = this.speed - ((Car)o).speed;
        if (temp == 0) {
            int tempPrice = this.price - ((Car)o).price;
            if (tempPrice == 0) {
                int tempModel = this.model.compareTo(((Car)o).model);
                if (tempModel == 0) {
                    return this.color.compareTo(((Car)o).color);
                }
                else return tempModel;
            }
            else return this.price - ((Car)o).price;
        } else {
            return temp;
        }
    }
}