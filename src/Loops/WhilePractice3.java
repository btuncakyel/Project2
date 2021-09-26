package Loops;

import java.util.Scanner;

public class WhilePractice3 {
    public static void main(String[] args) {

        /*
        Ask user to enter a int number
        find and print the numbers which can divide that given number
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        int divider = 1;

        while(divider <= number){

            if (number % divider == 0){
                System.out.println(divider);
            }
            divider++;


        }


    }
}
