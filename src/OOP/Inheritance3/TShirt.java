package OOP.Inheritance3;

final public class TShirt extends Shirt {
    String COLOR;  // if we create here we can change/reassing it beacuse it is different than from parent class


    public TShirt(){
        super("M",45.67);
    }
    String color;

//    @Override   // you cannot override a final method
//    public String info() {
//        return "This is info about T-shirt";
//    }
}
