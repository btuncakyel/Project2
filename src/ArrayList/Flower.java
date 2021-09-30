package ArrayList;

import java.util.ArrayList;

public class Flower {

    String color;
    String name;
    int numberOfPetal;
    double price;

    public Flower(String color, String name, int numberOfPetal, double price) {
        this.color = color;
        this.name = name;
        this.numberOfPetal = numberOfPetal;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", numberOfPetal=" + numberOfPetal +
                ", price=" + price +
                '}';
    }

    // create few flower object and store them in an arraylist
    public static void main(String[] args) {


    ArrayList<Flower> flowers = new ArrayList();   // I am going to store Flower object in this arraylist
        Flower fl1 = new Flower("White", "Rose", 12, 3.99);
        Flower fl2 = new Flower("Red", "Rose", 11, 2.99);
        Flower fl3 = new Flower("Yellow", "Rose", 10, 4.99);

    flowers.add(fl1);
    flowers.add(fl2);
    flowers.add(fl3);
        System.out.println(flowers);
        System.out.println(flowers.get(2).price);  // way one // 4.99
        System.out.println(fl3.price);            // way two  // 4.99

        System.out.println(price(flowers));  // for total price of the flowers

    }
    // create a method that will take an arraylist as a parameter
    // this method will return total price of the flowers

    public static double price(ArrayList<Flower> flowers ){

        double total = 0;
        for (int i = 0; i < flowers.size(); i++){
           total += flowers.get(i).price;
        }
        return total;
    }

}
