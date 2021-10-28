package Java.Array;

import java.util.Arrays;

public class MultiDimension2 {
    public static void main(String[] args) {

        String[][] states = new String[3][2];
        states[0][0] = "NY";
        states[0][1] = "PA";
        states[1][0] = "IL";
        states[1][1] = "OH";
        states[2][0] = "CA";
        states[2][1] = "WA";

        System.out.println(Arrays.deepToString(states));

        //Create a for loop to print these states

        String[] statesEmails = new String[6];
        int c = 0;
        for (int i = 0; i < states.length; i++) {

            for (int j = 0; j < states[i].length; j++) {
                statesEmails[c] = states[i][j].toLowerCase() + "@info.com";
                System.out.println(states[i][j]);
                c++;


            }
        }
        // create a for EACH loop to print these states

        System.out.println("================================================");

        for (String[] state : states) {

            for (String st : state) {

                System.out.println(st.toLowerCase()+ "@info.com");

            }

        }
        // print those states in lowercase

        // create like this for each state : ny@info.com, pa@info.com and STORE these email addresses in an array


    }
}