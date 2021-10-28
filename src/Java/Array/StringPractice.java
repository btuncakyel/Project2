package Java.Array;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {

        String[] studentName = new String[6];

        studentName[5] = "Zoly";
        studentName[2] = "Sorin";
        studentName[3] = "Sorin";
        studentName[4] = "Adel";

        System.out.println(Arrays.toString(studentName));

        studentName[4] = "David";
        System.out.println(Arrays.toString(studentName));

        // Create a loop to print out elements from the array

        for (int i = 0; i < studentName.length; i++){
            System.out.println(studentName[i]);

        }







    }
}
