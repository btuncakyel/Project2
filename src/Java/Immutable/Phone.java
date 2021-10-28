package Java.Immutable;

public class Phone {

    private String brand = "Iphone";
    private double price;
    private String color;
    private double size;

    public Phone(){     // if we make constructor private we cannot reach the this class and we cannot even create a object

    }

    public String getBrand(){
        return brand;
    }
    public double getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }
    public double getSize(){
        return size;
    }
    public void call(){
        System.out.println("Calling friend " + color);
    }
}
