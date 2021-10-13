package OOP.Inheritance;

public class WildAnimal extends Animal{

    String name = "Crock";
    String color;
    int age;

    // if we create here it will reflect the wildAnimal and their child
    // it will no reflect the animal Class or domestic class


    public void eat(){
        System.out.println("Wild animal is eating");
    }
    public int sleep(){
        System.out.println("Wild animal is sleeping");
        return 5;
    }
    Animal run(){
        System.out.println("Wild Animal is running");
        return new Animal();
    }


}
