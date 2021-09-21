package Project4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
                Using a scanner enter a sentence that is not separated by space and each word
        starts with upper case. Print given String as separated words with spaces.
        Example:
        Given Value: "IWantToLearnJava"
        Output: I Want To Learn Java
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string with no space and each word need to  start with uppercase");
        String text = input.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'){
                if (i == 0){
                    System.out.print(text.charAt(i));
                }else {
                    System.out.print(" " + text.charAt(i));
                }
            }else
                System.out.print(text.charAt(i));
            }
        }
    }




