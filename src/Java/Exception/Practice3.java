package Java.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        //Second way for exception

              FileInputStream file = null;
              file = new FileInputStream("Test.txt");

              Scanner scanner1 = new Scanner(file);

              while (scanner1.hasNextLine()) {

                  System.out.println(scanner1.nextLine());
              }
              int a = 15;
              int b = 10;
            Thread.sleep(5000);  // it will give exception after 5 second

            System.out.println("This is After Thread Sleep");

              if (a < b){

                  throw  new RuntimeException();

              }else if (a > b){

                  throw new IndexOutOfBoundsException("You are going out of bound");
              }





    }
}