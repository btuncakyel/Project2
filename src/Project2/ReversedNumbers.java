package Project2;

public class ReversedNumbers {
    public static void main(String[] args) {


        // TASK 5
        //Write a program that will accept 5 digit number and will print reversed number at the end.


        int number = 12345;
        int num1 = number % 10;
        number = number / 10;

        int num2 = number % 10;
        number = number/10;

        int num3 = number%10;
        number = number/10;

        int num4 = number%10;
        number = number/10;

        int num5 = number%10;
        number = number/10;

        System.out.println("" +num1+num2+num3+num4+num5);


    }
}