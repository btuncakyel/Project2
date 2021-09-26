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

        size = inputSize;
        isClean = inputClean;
        liquidAmount = inputLiquid;
    }

    public Cup(){

    }

    public void info(){

        System.out.println("Size: " + size + " is Clean: " + isClean + "liquid amount: " + liquidAmount);
    }
    public String toString(){

        //return "********************"; // it will replace with hashcode
        return "Size: " + size + " is Clean: " + isClean + " liquid amount: " + liquidAmount;
    }





}
