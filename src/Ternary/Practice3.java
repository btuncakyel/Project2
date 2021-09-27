package Ternary;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {

        /*
        ask user for their last name
        if last name starts with 'A' to 'K'
        concat the last name with "most popular last name"

        otherwise;
        contact the last name with: "well known last name"
        printout the result
       */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your last name?");
        String lastName = scanner.nextLine().toUpperCase();

        String print =lastName.charAt(0) >= 'A' && lastName.charAt(0) <= 'K' ? lastName + " most popular last name" : lastName + " well known last name";
        System.out.println(print);
    }
}
