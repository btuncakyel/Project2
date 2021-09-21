package Project3;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the String with the following format “ word ");

        String text = input.nextLine();
        int space = text.indexOf(" ");
        String modifiedString = text.substring(0,space +1) + text.substring(space+1,space +2).toUpperCase() + text.substring(space +2);


        System.out.println(modifiedString);




    }
}
