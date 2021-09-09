package Project2;

public class MultiplicationOfDigits {

    public static void main(String[] args) {

        //TASK 4
        //1. Write a program that will accept only 6 digit numbers like 578432
        // and find multiplication(5*7*8*4*3*2) of all digits and sum(5+7+8+4+3+2)of all digits.

        int number = 578434;

        int digit1 = number % 10;
        number = number /10;

        int digit2 = number % 10;
        number = number / 10;

        int digit3 = number % 10;
        number = number / 10;

        int digit4 = number % 10;
        number = number / 10;

        int digit5 = number % 10;
        number = number / 10;

        int digit6 = number % 10;


        int sumOfDigits =  digit1 + digit2 + digit3 + digit4 + digit5 + digit6;
        int productOfDigits = (digit1 * digit2 * digit3 * digit4 * digit5 * digit6);

        System.out.println("Sum of digits: "  + sumOfDigits);
        System.out.println("Product of digits :" + productOfDigits);
    }
}
