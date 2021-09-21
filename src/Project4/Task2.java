package Project4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /*
                Using the scanner asks the user to input the min and max
        number. Write a java code that will calculate the sum of
        numbers between the range of min and max and those that
        can only be divided by 2 and 7.
        (min and max numbers are included)
        Example:
        0, 50 -> 14 + 28 + 42 = 84
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter min number");
        int minNum = scan.nextInt();

        System.out.println("Please enter max number");
        int maxNum = scan.nextInt();

        int sum =0;

        String sumTheNumbers = "";

        for (; minNum <= maxNum; minNum++) {

            if (minNum %2 == 0 && minNum %7 == 0){

                if(minNum + 14 > maxNum){
                    sumTheNumbers += minNum + "=";

                }else {
                    sumTheNumbers += minNum + "+";

                }sum += minNum;

            }


        }System.out.println(sumTheNumbers + sum);




    }
}
