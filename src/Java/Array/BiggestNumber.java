package Java.Array;

import java.util.Arrays;

public class BiggestNumber {

        public static void main(String[] args) {

        /*
        create an array to store these numbers: 34, 5,6,47,57,8,12,0,30
        find the biggest number from this array
         */

            int[] numbers = {34, 5,6,47,57,8,12,2,30};


            int biggest = numbers[0];

            for (int i = 1; i < numbers.length; i++){

                if (numbers[i] > biggest){

                    biggest = numbers[i];
                }

            }
            System.out.println(biggest);

            System.out.println(Arrays.toString(numbers));

            //-------------------------------------------------------------------------------------------

            Arrays.sort(numbers);             // it will sort smallest to largest
            System.out.println(Arrays.toString(numbers));

            // print biggest last element from this array

            System.out.println(numbers[numbers.length-1]);  // it will shows largest number which is last number after sorting

            // print smallest/first elements from this array

            System.out.println(numbers[0]);  // it will give smallest number which is first number after sorting

           //--------------------------------------------------------------------------------------------------------

            // write a code to find smallest number with using sort method

            int[] numbers1 = {34, 5,6,47,57,8,12,30, -25};

            int smallest = numbers1[0];

            for (int i = 1; i < numbers1.length; i++){

                if (numbers1[i] < smallest){

                    smallest = numbers1[i];
                }

            }
            System.out.println("The smallest number is : " + smallest);



        }
    }

