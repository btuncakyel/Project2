package Java.Methods;

public class CarTest {
    public static void main(String[] args) {



    Car c1 = new Car("Lexus");
    Car c2 = new Car("Lexus");
    Car c3 = new Car("Lexus");
    Car c4 = new Car("BMW");

    Car c5 = new Car("BMW");
    Car c6 = new Car("BMW");

    c1 = null;

    String str = "Test";
    String str2 = "Test";
    String  str3 = new String("Test");


    System.out.println(c4);
    // System.gc();

    // equals()  vs  ==
    System.out.println(c2.equals(c3)); // false
    System.out.println(c2 == c3);  //  false

    System.out.println(str.equals(str2));  //true
    System.out.println(str == str2);  //true
    System.out.println(str.equals(str3));  //true


        // if you compare objects use == sign
        //if you compare string use .equals() method



    }

}
