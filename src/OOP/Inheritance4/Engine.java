package OOP.Inheritance4;

public class Engine {
    public static void main(String[] args) {

        Vehicles vehicles = new Vehicles();

        vehicles.start();
        vehicles.start();

        Car car = new Car();

        car.start();
        car.drive();



    }
}
