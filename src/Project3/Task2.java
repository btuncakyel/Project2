package Project3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter String value");
        String string = input.nextLine();

        System.out.println("Please enter starting value");
       int starting = input.nextInt();

        System.out.println("Please enter ending value");
        int ending = input.nextInt();

       String newString =  string.substring(starting-1,ending);
        System.out.println(newString);






    }
}
