package Loops;

public class ForLoop1 {
    public static void main(String[] args) {

        for (int number = 0;  number <= 5; number++){
            System.out.println("It is for LOOP"+number);

        }
        int number = 1;
        for (;  number <= 5; number++){
            System.out.println("It is second for LOOP"+number);
        }
        for (; number < 10; ){
            number++;
            System.out.println("It is third for LOOP" +number);
        }


            //only second condition have to be inside of the parentheses otherwise will be infinite
            //first and last condition can be outside the parentheses
    }
}
