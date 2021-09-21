package Project4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        /*
                        Ask the user to enter one in number between 1 to 10 then, Write the
                program to print the string in the following format:
                Example:
                Input: 6
                Output:
                666666
                55555
                4444
                333
                22
                1
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one number between 1 to 10");
        int num = input.nextInt();

        int i, j;
        for (i = num; i >= 1; i--){
            for (j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }


    }
}
