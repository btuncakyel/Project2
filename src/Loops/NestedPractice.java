package Loops;

public class NestedPractice {

    public static void main(String[] args) {

        /*
         print the months for the every year for the years from 2020 to 2023
         2020
         1,2,3,......12

         2021
         1,2,3,......12

         2022
         1,2,3,.......12

         2023
         1,2,3,.....12
         */

        for (int year = 2020;  year <= 2023; year++){

            System.out.println(year);

            for (int month =1; month <= 12; month++){

                System.out.println( "month " + month +  " , ");

                    for (int week = 1; week <= 4; week++){

                        System.out.println("week >>> " + week);
                    }

            }
            System.out.println();
        }




    }
}
