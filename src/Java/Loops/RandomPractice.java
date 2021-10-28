package Java.Loops;

import java.util.Random;

public class RandomPractice {
    public static void main(String[] args) {

        Random number = new Random();

        int a = number.nextInt(1000);  // give limit or max. you cannot give negative number
        System.out.println(a);



    }
}
