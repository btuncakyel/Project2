package Loops;

public class ForLoop4 {
    public static void main(String[] args) {

        //String str = "aB*12345&*!d";
        //count and print how many letters are there in the string
        //count and print how many numbers are there in the string
        //count and print how many other are there in the string
        //"There are 3 letter in the string"
        //"There are 5 numbers in the string"
        //"There are 4 other chars in the string"

        String str = "aB*12345&*!d";
        str = str.toLowerCase();
        int letterCounter = 0;
        int numberCounter = 0;
        int charCounter = 0;

        for (int i =0; i < str.length(); i++ ){

            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ){
                letterCounter++;

            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                numberCounter++;

            } else {
                charCounter++;

            }

        }
        System.out.println(" There are " + letterCounter + " letters in the string");
        System.out.println(" There are " + numberCounter + " numbers in the string");
        System.out.println(" There are " + charCounter + " other symbols in the string");

    }
}
