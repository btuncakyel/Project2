package Methods;

public class Car {

    //Create a car class with instance field of brand of the car
    // create ane move method to simply print out "car is moving"
    //create a test class to test this car class
    //inside of the test class create a multiple objects
    //sent some of the object to garbage
    //make sure gc() is working

    String brand;

    public void move(){
        System.out.println("Car is moving");
    }

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "The brand of the name " + brand;
    }

    @Override
    protected void finalize(){
        System.out.println("Car is going to garbage");

    }
}
