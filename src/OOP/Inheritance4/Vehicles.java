package OOP.Inheritance4;

public class Vehicles {

    /*
    -Vehicle
  Variables:
    protected  model;
    default year;
    public brand;
  Methods:
    drive(); --> vehicle is moving
    stop(); --> return true, vehicle is stopping
    protected start(); --> return true, vehicle is starting
    default accelerate(); --> return Object
  Constructor: create a constructor to initiliaze instance variables
-Car
  *extends Vehicle
  variables:
    model;
    engineType;
  Methods:
    Override drive(); --> Car is moving
    Override accelerate(); --> return Integer and calls model from parent class
     */

    protected String  model;
     final int YEAR = 1990;  //   if we finalize we need to initialize and take out the year from the constructor
    public String brand;

    public static void drive(){
        System.out.println("Vehicle is moving");
    }
    public  boolean stop(){
        System.out.println("Vehicle is stopping");

        return true;
    }
   final protected boolean start(){
        System.out.println("Vehicle is starting");

        return true;
    }
    Object accelerate(){

        return new Object();
    }

    public Vehicles(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public Vehicles(){

    }
}
