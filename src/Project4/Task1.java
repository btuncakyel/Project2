package Project4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /*
                Reverse a given String and return it, if they have space in the
        beginning and at the end then remove it.
        Example:  " Job" -> "boJ"
         * " Happy " -> "yppaH"
         * "Sun " -> "nuS"
         * " Dream Job!" -> "!boJ maerD"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter string value");
        String word = input.nextLine().trim();


        for (int i = word.length()-1; i >= 0; i--){
            System.out.print(word.charAt(i));

        }


    }
}
