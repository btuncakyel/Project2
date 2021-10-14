package OOP.Inheritance1;

public class Rose extends Flower{

    public Rose(){

        super("Flower", "yellow", 12);

        // if we create a constructor in parent class we need t pass those parameters form parent to child by using super();

    }

    public Rose(String color){

        super("Flower", "Red", 33);
        this.color = color;  // color became red to pink
        super.color = "Blue";   // color became pink to blue
    }

}
