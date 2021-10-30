package Java.OOP.Inheritance1;

public class Store {

    public static void main(String[] args) {


        Flower flower = new Flower("Lilly", "White",11);

        Rose rose = new Rose();

        System.out.println(flower.color);
        System.out.println(rose.color);

        Rose rose1 = new Rose("Pink");
        System.out.println(rose1.color);
        System.out.println(rose1.color);
        System.out.println(rose.color);
        System.out.println(flower.color);

        Tulip tulip = new Tulip();
        System.out.println(tulip.color);

        tulip.color = "White";
        System.out.println(tulip.color);

        Flower flower1 = new Flower();
        System.out.println(flower1.color);

        Tulip tulip1 = new Tulip();
        System.out.println(tulip1.color);

        Tulip tulip2 = new Tulip("TULIP2", "Black", 4.5);
        System.out.println(tulip2.name);



    }
}
