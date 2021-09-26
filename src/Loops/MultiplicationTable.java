package Loops;


import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args) {

        /*
        use for loop to create a multiplication table for number 6
        from 1 to 6
        6 * 1 = 6
        6 * 2 = 12
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        int number = input.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);

        }

        /*
        use for loop to create a multiplication table for numbers 1 to 10
        from 1 to 10
         */


        for (int num1 = 1; num1 <= 10; num1++) {
            for (int num2 = 1; num2 <= 10; num2++) {

                System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
            }

        }

        /*
        perfect number: a number is equals to its dividers' (except number itself) sum
        6 >> 1,2,3 >> 1+2+3 =6   6 = 6 is perfect number
         */

        int perfectN = 6;
        int sum = 0;

        for (int divisor = 1; divisor < perfectN; divisor++){

            if (perfectN % divisor == 0){
                sum += divisor;
            }
        }
        System.out.println("The sum i s >> " +sum);

        if (perfectN == sum){
            System.out.println("The number " + perfectN + " is a perfect number");

        }else {
            System.out.println("The number " + perfectN + " is not perfect number");
        }
    }
}