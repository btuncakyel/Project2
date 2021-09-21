package Project3;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter one sentence with three words");
        String text = input.nextLine();

        int  indexSpace1 = text.indexOf(" ");
        System.out.println("Space 1 Index : " + indexSpace1);
        System.out.println("Word 1 Last Charecter's Index : " + (indexSpace1 - 1));

        int indexSpace2 = text.indexOf( " ", indexSpace1 + 1);
        System.out.println("Space 2 Index : " + indexSpace2);
        System.out.println("Word 2 Last Charecter's Index : " + (indexSpace2 - 1));


        int lastLetterIndex = text.length()-1;
        System.out.println("The index of last letter : " + lastLetterIndex);

        int sum = (indexSpace1 -1)+(indexSpace2 -1)+lastLetterIndex;
        System.out.println("Sum of last letter of each words :" + sum);





    }
}
