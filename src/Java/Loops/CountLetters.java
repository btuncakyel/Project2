package Java.Loops;

public class CountLetters {
    public static void main(String[] args) {

        /*
        "I want to solve this questions by myself this time"
        count how many 'i' and 'I' are in the given sentence
        print --> there are ... is in the given sentence
         */

        String text = "I want to solve this questions by myself this time";

        int index = 0;
        int count = 0;



        while (index < text.length()){

            if (text.charAt(index) == 'i' || text.charAt(index) == 'I'){

                count++;
            }
           index++;

        }
        System.out.println("There are " + count + " 'i'  in the given sentence.");


    }
}
