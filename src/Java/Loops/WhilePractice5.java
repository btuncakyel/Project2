package Java.Loops;

import java.util.Scanner;

public class WhilePractice5 {
    public static void main(String[] args) {

        /*
        ask user to give a number
        create a multiplication table from 1 to 10 for that given number
        5 >> 5*1 = 5
            5*2 = 10
            ......
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter integer number");
        int number = input.nextInt();

        int multiplier = 1;

        while (multiplier <= 10){

            System.out.println(number + " * " + multiplier + " = " + number * multiplier);
            multiplier++;
        }

    }
}
