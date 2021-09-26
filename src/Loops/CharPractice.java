package Loops;

public class CharPractice {

    public static void main(String[] args) {

        //print out the alphabet in upper case letters



        for (char ch = 'A', ch1 = 'a'; ch <= 'Z'&& ch1 <= 'z'; ch++, ch1++){
            System.out.print(ch + " - ");
            System.out.println(ch1 );
        }

        for (char ch = 'A', ch1 = 'b'; ch <= 'Z'; ch+=2, ch1 += 2){
            System.out.print(ch + " - ");
            System.out.print(ch1 + " - ");
        }
    }
}
