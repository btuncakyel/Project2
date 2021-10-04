package Object;

import Methods.Math;

public class AnimalTest {

    public static void main(String[] args) {

        Animal cat = new Animal();

        System.out.println(cat.name);
        cat.name = "Tom";
        System.out.println(cat.name);

        cat.age = 5;
        cat.weight = 8.5;
        cat.legNumber = 4;

        System.out.println(cat.age);
        System.out.println(cat.weight);
        System.out.println(cat.legNumber);

        // create a dog object and initialize each variable and print out

        Animal dog = new Animal();
        dog.name = "Max";
        dog.age = 3;
        dog.weight = 14.8;
        dog.legNumber = 4;

        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.weight);
        System.out.println(dog.legNumber);

        Animal bird = new Animal();
        System.out.println(bird.weight);

        //cat.run();
        dog.run("West");

        cat.sleep();
        dog.sleep();
        bird.sleep();

        cat.printInfo();
        dog.printInfo();
        bird.printInfo();

        bird.legNumber = 2;
        bird.printInfo();

        System.out.println("=========================");
        cat.printInfo();
        cat.energy = 100;
        cat.printInfo();
        cat.run("Up");
        cat.printInfo();
        cat.run("South");
        cat.run("Down");
        cat.printInfo();

        cat.sleep();
        cat.printInfo();

        bird.energy = 100;
        bird.sleep();
        bird.run("North");

        Math obj1 = new Math();  // if you create new object this class you can call the method from other class
        obj1.sum(1,3);

    }
}
