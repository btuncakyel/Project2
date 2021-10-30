package Java.OOP.Inheritance1;

public class Flower {

    String color;
    String name;
    double height;

    public Flower(String newName, String newColor, double newHeight){
        this.name = newName;
        this.color = newColor;
        this.height = newHeight;

    }
    public Flower(){
        // if we do not have empty constructor in parent class, child classes are complaining

    }

}
