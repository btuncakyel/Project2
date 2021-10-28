package Java.ArrayList;


import java.util.ArrayList;

public class ArrayListToArray {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("Honda");
        cars.add("Lexus");
        cars.add("Tofas");

        //How to convert to Java.ArrayList to array is by using "toArray" method
        String [] cars1 = (String[]) cars.toArray();

        System.out.println();


    }

}
