package Java.Array;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args) {

        int numbers[] = {45,5,6,47,57,8,12,0,30};

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);  // sort method will put elements in ascending order(from smaller to larger)
        System.out.println(Arrays.toString(numbers));

        String [] colors = {"Red", "Yellow", "brown", "Blue", "White","Orange", "Green", "Pink", "Violet", "Black", "12", "43", "aAbc", "aABc", "aAbc"};

        System.out.println(Arrays.toString(colors));

        // in ASCII table number come first then upper case letter then lowercase letter. so it will sort according to ASCII table

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));

        for (int i = 0; i <colors.length; i++){

            colors[i] = colors[i].toLowerCase();
        }
        Arrays.sort(colors);               // we put in for and reach to every single elements to make lower case.then we sort it with new format then print it
        System.out.println(Arrays.toString(colors));
    }
}
