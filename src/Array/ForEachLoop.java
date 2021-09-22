package Array;

import java.util.Locale;

public class ForEachLoop {
    public static void main(String[] args) {


        String[] colors = {"Red", "Yellow", "brown", "Blue", "White", "Orange", "Green", "Pink", "Violet", "Black"};

        // for each loop--> it will start beginning of the array and go to teh end of it

        for (String color : colors) {

            System.out.println(color.toUpperCase());

        }
        int[] ids = {9, 5, 8, 23, 45, 12, 50, 30, 100, 11};

        //use for each loop to print out these elements from int array
        //print only numbers they are 50 or greater

        for (int num : ids) {
            // System.out.println(num);   // it will print all number


            if (num >= 50) {         // it will print number which 50 or greater than 50
                System.out.println(num);
            }
        }

        //print out only letter from the char
        char[] characters = {'g', '1', 5, '$', '*', 'A', 'H', '['};

        for (char ch : characters) {

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                System.out.println(ch);

            }

        }
        //--------------------------------------------------------------------------------------------------------------

        for (char ch1 : characters) {

           // Character.isDigit(ch1);  // it will check for it is number or not. it will give only numbers
          //  System.out.println(ch1);

            //Character.isAlphabetic(ch1);  // this method(isAlphabetic) will look if there is a letter or not
          //  System.out.println(ch1);

             if (Character.isAlphabetic(ch1) ||Character.isDigit(ch1) ){
                 System.out.println(ch1);
              }
        }
    //------------------------------------------------------------------------------------------------------------------

        // print all other symbols by using above methods
        for (char ch1 : characters){
            if (!Character.isAlphabetic(ch1) && !Character.isDigit(ch1)){
                System.out.println(ch1);  // if it is not number or letter then print like symbols
            }

        }




    }

}