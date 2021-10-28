package Java.Loops;

public class DoWhilePractice {

    public static void main(String[] args) {

        int number = 10;

         // while (number >= 0){
        //    System.out.println(number);
        //    number--;
        //  }

        do {
            System.out.println(number);
            number--;
        }while (number >= 0);

       //==================================================================
       // to see differneces between do and do-while. do while even it false it will run at least one time

         number = 10;
        do {
            System.out.println(number);
            number--;
        }while (number < 0);   // when it false , it will run one time and it give only 10

        //===============================================================================

        /*
        find the sum of the numbers from 10 to 15
        print the result as " The total is ..."
         */

        int total = 0;
        int num = 10;

        do {
            total = total + num;
            num++;
            //System.out.println("The total is " + total); it will shows for each

        }while (num  <= 15);
        System.out.println("The total is " + total); // it will shows only last one which is 75





    }


}
