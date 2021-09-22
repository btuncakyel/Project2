package Array;


import java.util.Arrays;

public class SplitPractice1 {
    public static void main(String[] args) {

        String date = "12.03.2021";

        //check if the month is 12 and print out : it is correct month
        // for dot use --> \\.

        String[] splitDate = date.split("\\.");  // for dot we need to use --> "\\."
        System.out.println(Arrays.toString(splitDate));

        if (splitDate[0].equals("12")){
            System.out.println("It is correct month");

        }
        String date1 = "11/03/2020";
        String[] splitDate1=  date1.split("/");
        System.out.println(Arrays.toString(splitDate1));

        String text = "My favorite color is \"blue\" . \n How about you?\t \\";
        System.out.println(text);



    }
}
