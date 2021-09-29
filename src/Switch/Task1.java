package Switch;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /*
        solve the question by using the switch
        ask user to provide number between 1 to 7
        print the matching name of the day for that number
        when user enter 1 print --> 'It is Monday'
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number 1 to 7 to see days of week");
        int number = input.nextInt();

        switch (number){
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("There is no matching day for your entry");
        }
    }
}
