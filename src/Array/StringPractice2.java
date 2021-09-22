package Array;

import java.util.Arrays;
import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {

        /*
        ask user how many names they want to store
        -get names from user to save
        - store those names in an String array
        -print out those names by using toString() method
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many names you want to store");
        int size = scan.nextInt();


        String[] names = new String[size];


        for (int i = 0; i < size; i++){

            System.out.println("please enter name");
            names[i] = scan.next();

        }
        System.out.println(Arrays.toString(names));

    }
}
