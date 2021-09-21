package Project3;

import java.util.Locale;

public class Task3 {

    public static void main(String[] args) {


        String firstString ="  Snicker  ";
        char firstChar =  firstString.trim().toUpperCase().substring(2,5).charAt(0);
        System.out.println(firstChar);


        String secondString = "Cookie";
        boolean newValue = secondString.toLowerCase().replace('o','u').concat("s").startsWith("C");
        System.out.println(newValue);
    }
}
