package OOP.Inheritance3;

public class Mall {
    public static void main(String[] args) {

        Shirt shirt = new Shirt("L",23.99);
        System.out.println(shirt.price);
      //  shirt.COLOR = "Red";  // it will  not compile/ we cannot reassign because we finalize it

        TShirt tShirt = new TShirt();
        // tShirt.COLOR = "Black";  // we cannot reassign/compile for child as well

        tShirt.COLOR = "Orange";
        System.out.println(tShirt.COLOR);

        TShirt tShirt1 = new TShirt();
        System.out.println(tShirt1.COLOR);  // null because it is a new object
        System.out.println(tShirt1.color);
        shirt.info();
    }
}
