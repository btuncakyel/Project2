package Loops;

public class ForLoop2 {
    public static void main(String[] args) {

        //print out the letters from a given String value : chicago


        String word = "Chicago";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));


        }

        System.out.println("*****************");

        //print out the letter starting from end to the starting


        for (int index = word.length() - 1; index >= 0; index--) {
            System.out.println(word.charAt(index));
        }

        System.out.println("*****************");

        //Print out only letter 'o' from this String
        //count the amount of letter 'o's

        String str = "Today is the day to practice for loop";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'o') {
                System.out.println(str.charAt(i));
                System.out.println("the index number of 'o' is " +i); // "the index number of 'o' is"....(show index number of each letter 'o')
                System.out.println("the index number of " + count+ ". 'o' is " + i);
                count++;
            }

        }
        System.out.println("count of 'o' is " + count);







    }
}