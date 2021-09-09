package Project2;

public class SumOfDigits {

    public static void main(String[] args) {

        //Task 4
        //327695
        //Multiplication of all digits is 11340
        //Sum of all digits is 32

        int number = 327695;

        int digit1 = number % 10;
        System.out.println("Digit1 is : " + digit1);

        number = number / 10;
        int digit2 = number % 10;
        System.out.println("Digit2 is : " + digit2);

        number = number / 10 ;
        int digit3 = number % 10;
        System.out.println("Digit3 is : " + digit3);

        number = number / 10;
        int digit4 = number % 10;
        System.out.println("Digit4 is :" + digit4);

        number = number / 10;
        int digit5 = number % 10;
        System.out.println("Digit5 is :" + digit5);

        number = number /10 ;
        int digit6 = number % 10;
        System.out.println("Digit6 is :" + digit6);

        int sumOfDigits = digit1 + digit2 + digit3 + digit4 + digit5 + digit6;
        System.out.println("The sum of all digits are " + sumOfDigits);


    }
}
