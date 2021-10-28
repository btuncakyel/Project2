package Java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /*
        ask user how many names they want to store
        -get names from user to save
        -store those names in a string array
        if the names has more than 5 letters; save it ot an array as longNames
        if the names has less than 5 letters save it to an array as shortNames
         -print out those longNames and shortNames array y using toString() method

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many names you want to store");
        int size = scan.nextInt();

        String[] longNames = new String[size];
        String[] shortNames = new String[size];


        for (int i = 0; i < size; i++){

            System.out.println("Please enter a name");
            String name = scan.next();

            if(name.length() >=5){
                longNames[i] = name;

            }else {
                shortNames[i] = name;
            }

            }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortNames));

        }



    }



