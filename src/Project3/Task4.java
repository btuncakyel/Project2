package Project3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter String1");
        String str1 = input.nextLine();

        System.out.println("Please enter String2");
        String str2 = input.nextLine();

        System.out.println("Please enter String3");
        String str3 = input.nextLine();

        int smallestAscii = 65;
        int biggestAscii = 90;

        boolean equalLenght = str1.length() == str2.length() && str2.length() == str3.length();

        boolean hasJavaSmall= str1.contains("java") || str2.contains("java") && str3.contains("java");
        boolean hasJavaUpper = str1.contains("Java")|| str2.contains("Java") && str3.contains("Java");


       boolean str1IsCAp = str1.charAt(0)  >= smallestAscii || str1.charAt(0) <= biggestAscii;
       boolean str2IsCAp = str1.charAt(0)  >= smallestAscii || str1.charAt(0) <= biggestAscii;
       boolean str3IsCAp = str1.charAt(0)  >= smallestAscii || str1.charAt(0) <= biggestAscii;

       boolean finalResult = equalLenght && (hasJavaSmall || hasJavaUpper) && (str1IsCAp && str2IsCAp && str3IsCAp);

       System.out.println(finalResult);






    }

}
