package OOP.Inheritance;

public class Animal {

    String name = "Hippo";
    String color;
    int age;
    // if you give the value in the animal class it animal names will be same
    // each animal should have their own name, color, age

    public int sleep(){
        System.out.println("Animal is sleeping");
        return 5;
    }
    public void eat(){
        System.out.println("Animal is eating");
    }


}
