package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {


       try {

           FileInputStream file = null;
           file = new FileInputStream("Test.txt");

           Scanner scanner1 = new Scanner(file);

           while (scanner1.hasNextLine()){

               System.out.println(scanner1.nextLine());
           }

       }catch (FileNotFoundException exception){

           System.out.println("File not Found");
           System.out.println(Arrays.toString(exception.getStackTrace()));
           System.out.println(exception.getCause());
           System.out.println(exception.getMessage());

            // it will not shows anything is console because it found  Test.txt file in the package
           // if we change the name of the file, then it will shows "File not Found" message in console
       }

       finally {  // execute as last

           System.out.println("This is finally block");
           System.exit(0);

       }
    }
}
