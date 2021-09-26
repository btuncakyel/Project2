package Loops;

public class WhilePractice2 {

    public static void main(String[] args) {

        /*
        print out "I am here today"
        for the ages from 23 to 26
        before 23 and after 26 print --> I am not here
         */

        System.out.println("I am not here");

        int age =23;

        while(age <= 26){
            System.out.println("I am here");
            age++;                  // if we do not update like this in this line, it will go forever
        }
        System.out.println("I am not here");


        /*
        print out number between 10 to 20

         */

        int number = 10;

        while (number <= 20){
            System.out.println(number++);

        }



    }
}
