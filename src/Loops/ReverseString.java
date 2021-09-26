package Loops;

public class ReverseString {
    public static void main(String[] args) {

        /*
        1-Selenium: reverse it and print it as a new string as reversed version

        2-Palindrome word ==> efe, eye, anna
        check if the given string is palindrome or not
         */

        String text = "Selenium"; // if type "efe" or " anna"  it will be palindrome

       String  reverse = "";
        for (int i = text.length()-1; i >=0; i-- ){
            reverse += text.charAt(i);

        }
        System.out.println(reverse);


        //========================================================

        if(text.equalsIgnoreCase(reverse)){
            System.out.println("The word is palindrome " + text);

        }else System.out.println("this is not palindrome " + text);


    }
}
