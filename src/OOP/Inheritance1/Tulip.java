package OOP.Inheritance1;

public class Tulip extends Flower{

    public Tulip(){
        super("Daisy","purple",2.5);
        // super(); call the argument from parent
    }
    public Tulip(String color){
        this.color = color;
        super.color = color;

    }
    public Tulip(String newName, String newColor, double newHeight){

        super("newName", newColor, newHeight);
    }
}
