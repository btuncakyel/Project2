package OOP.Interface1;

public interface Shape {

    int SIDE = 5;
    // when you create a interface class your instance variables are gonna be final so you have to initiliaze it

     Number area(int side);
    // in interface class methods are already public
    // you cannot have regular method in interface class

    //If you have primitive object you cannot have co-variant
    // you need to Number object to have it
    //co-variant of the Number are --> Integer, Double, .....


    Number perimeter();

    default void info(){   // when you write default keyword than it will be regular class, non-abstract. Default means here is public not default
        System.out.println("I am info about Shape interface");
    }

    default void info(String nameOfShape){
        System.out.println("I am info about Shape " + nameOfShape);
    }
    private void info2(){
        // not useful to make it private, because you cannot override, call
    }
    //protected void info3(){}  // you cannot make protected
}
