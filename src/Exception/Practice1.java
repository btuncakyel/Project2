package Exception;

public class Practice1 {

    public static void main(String[] args) {

        //First way to do exception

        System.out.println("This is my first print BEFORE exception");

        try {

            String str = "35c";

            int number = Integer.parseInt(str);
            System.out.println(number);     // if we comment this, the second cath block will shows in console


        }catch (NumberFormatException exception){

//            int number = 5;
//            int number2 = 25;  //  you can have a code inside of the catch block

            System.out.println("This is inside of CATCH block");

        }catch (IndexOutOfBoundsException exception){

            System.out.println("This is SECOND Catch Block");
        }

        try {

            String str = "35c";

            String sub = str.substring(5);


        }catch (IndexOutOfBoundsException exception){
            System.out.println("This is SECOND TRY-CATCH block");
        }

        // the purpose is cut the mistakes and let the code is executing rest of the code

        System.out.println("This is my  print AFTER exception");

    }

}
