package Project4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter int value");
        int num = input.nextInt();

        boolean prime = true;

        for (int i = 2; i < num; i++){

            if(num%i == 0){
                System.out.println("it is not a prime");
                prime = false;
                break;
            }

        }if (prime == true){
            System.out.println("It is a prime number");

        }



    }
}
