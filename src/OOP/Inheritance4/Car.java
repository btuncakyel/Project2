package OOP.Inheritance4;

public class Car extends Vehicles{

    String model;
    String engineType;


    public static void drive(){
        System.out.println("Car is moving");
    }
    @Override
    protected Integer accelerate(){
        System.out.println(super.model);
        return 0;
    }
    // since the access modifier is same or more accessible or co-variant we can override
   // when we make static the method we cannot override and we need to make static in child class that method so after that it will be separate method

}
