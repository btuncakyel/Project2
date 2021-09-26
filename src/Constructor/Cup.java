package Constructor;

public class Cup {

    // create a cup class with the instance fields of:
    // size, isClean, liquidAmount
    //create a constructor to initialize all of these instance fields
    // create a test class and create few objects to test your code

    int size;
    boolean isClean;
    double liquidAmount;

    public Cup(int inputSize, boolean inputClean, double inputLiquid ){
        this();  // this 3 argument constructor call constructor with no argument
                // call constructor inside of the constructor
                //it should be in the very first line
        size = inputSize;
        isClean = inputClean;
        liquidAmount = inputLiquid;
    }

    public Cup(int newSize, boolean newClean){
        this.size = newSize;
        this.isClean = newClean;
        System.out.println("This is two argument constructor");
    }
    public Cup(){
        this(33,true);  // it refers/ call two arguments constructor
        System.out.println("This is NO argument constructor");

    }

    public void info(){

        System.out.println("Size: " + size + " is Clean: " + isClean + "liquid amount: " + liquidAmount);
    }
    @Override
    public String toString(){

        //return "********************"; // it will replace with hashcode
        return "Size: " + size + " is Clean: " + isClean + " liquid amount: " + liquidAmount;
    }

    @Override
        protected void finalize(){
            System.out.println("Now one object went to the garbage");
        }



}
