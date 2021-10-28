package Java.Array;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        /*
        1- create an array to store these numbers: 45, 5, 6, 47, 57, 8, 12, 0, 30
        using loop print out only numbers they are greater than 10

        2- store numbers they are less than 10 in another array
         */

        int[] numbers = {45, 5, 6, 47, 57, 8, 12, 0, 30};


        int smallNumber[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){

            if (numbers[i] >= 10){

                System.out.println("The numbers that greater ten : " + numbers[i]);

            }else {
                smallNumber[i] =numbers[i];
            }
        }
        System.out.println(Arrays.toString(smallNumber) );


    }
}
