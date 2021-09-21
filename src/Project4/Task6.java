package Project4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        /*
                Using the scanner ask the user to enter one string value and print only
        unique letters combined as String also without any space in the
        beginning and at the end.
        Example -1 :
        Given Value: "i am happy"
        Output: i am hpy
        Example-2:
        Given Value: " contribute"
        Output: contribue
        Example-3:
        Given Value: " i want cup of coffee "
        Output: i want cup of e
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter string");
        String text = input.nextLine();

        String free = "";

        for (int i = 0; i < text.length(); i++){

            if (text.charAt(i) == ' '){
                free += text.charAt(i);
               continue;
            }

            if (!free.contains(text.charAt(i)+"")){
                free += text.charAt(i);

            }

        }
        System.out.println(free);



    }
}
