package Array;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        int [] numbers = new int[5];

        System.out.println(numbers);   // it will show location in the memory which is called hashcode

        numbers[0] = 11;
        System.out.println(numbers[0]);  // it will show 11 in console
        System.out.println(numbers[1]);  // it will shows 0 because we did not store anything in 1 so it will be default

        numbers[1] = 22;
        numbers[4] = 44;

        System.out.println(numbers[4]);  //it will shows 44

        // numbers[5] = 55;   // it will give ArrayIndexOutOfBoundsException  since there is no 5 th index
        // System.out.println(numbers[5]);  // it will give ArrayIndexOutOfBoundsException  since there is no 5 th index

        System.out.println(Arrays.toString(numbers));  //it will shows everything as a string and it will shows everything in array
                                                        // toString is coming from Array cLass

        for (int i = 0; i < numbers.length; i++){
            System.out.println("From for loop >>> " + numbers[i]);

        }


    }
}
