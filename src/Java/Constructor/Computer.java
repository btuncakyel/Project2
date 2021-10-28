package Java.Constructor;

public class Computer {

    //create a computer class
    //have instance field of price of the computer
    //create a calculate method to find the total price of 4 computers
    //this method will take an array as a parameter which represents prices of those 4 computers
    //this method will return the total price

    //create two constructor
    //  -- one with nor args
    //  -- one with args to init the instance variable

    //override the toString method to show price of the computer


    double price;
    public Computer(){
        System.out.println("This is NO constructor");
    }
    public Computer(double price){
        this.price = price;
        System.out.println("This is One argument constructor");
    }
    public static  double calculate(double[] priceOfComputers){
        double totalPrice = 0;
        for (double price : priceOfComputers){
            totalPrice += price;
        }
        return totalPrice;
    }
    public String toString(){
        return "" + price;
    }

    public static void main(String[] args) {

        double[] array = {1.2, 2.3, 4.5, 8.6};

        double total = calculate(array);
        System.out.println(total);
        Computer c1 = new Computer();
        System.out.println(c1);
    }

}
