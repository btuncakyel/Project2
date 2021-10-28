package Java.AccessModifiers;

public class Animal {
    /*
        1- public
    - anywhere in the project

    2- private
    - only in the same class

    3- protected
    - same package and subclasses/child class

    4- default
    - *there is no key word as 'default' if you do not specify access modifer it is default
    - only in the same package
     */

    public  String name;
    private String color;
    protected  String gender;
    int age;  // it there is no key word for access modifier that means it is a "default"

    public  void sleep(){
        System.out.println("Animal is sleeping");
    }
    private void eat(){
        System.out.println("Animal is eating");
    }
    protected void run(){
        System.out.println("Animal is running");
    }
    void swim(){           // default method
        System.out.println("Animal is swimming");
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.color = "Orange";
        animal.eat();
        System.out.println(animal.color);

    }
}
