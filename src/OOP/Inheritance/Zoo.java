package OOP.Inheritance;

public class Zoo {
    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println(animal.color);


        WildAnimal wildAnimal = new WildAnimal();
        System.out.println(wildAnimal.color);

        Cat cat = new Cat();
        System.out.println(cat.color);

        animal.color = "brown";
        System.out.println(animal.color);
        Animal animal1 = new Animal();
        System.out.println("animal1 color " + animal1.color);
        // when we create a new object, it will be default if we did not initialize in the Animal class

        System.out.println(cat.color);

        System.out.println(wildAnimal.color);

        // if we are change in the main class changes doe not reflect to the child
        // because creating object for each class that means they are separate

        System.out.println(animal.name);
        System.out.println(cat.name);
        System.out.println(wildAnimal.name);

        Lion lion = new Lion();
        System.out.println(lion.name);

        cat.name = "Tom";
        System.out.println(cat.name);

        DomesticAnimal domesticAnimal = new DomesticAnimal();
        System.out.println(domesticAnimal.name);


        // child cannot change/pass to the parent name

        domesticAnimal.name = "Rex";
        System.out.println(domesticAnimal.name);
        System.out.println(cat.name);
        //each object can have their own feature if we do not change from the their class

        animal.eat();
        lion.eat();
        wildAnimal.eat();
        System.out.println("========================");
        lion.sleep();
        lion.run();
        wildAnimal.run();
        lion.roar();

    }
}
