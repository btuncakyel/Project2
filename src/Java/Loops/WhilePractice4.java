package Java.Loops;

import java.util.Scanner;

public class WhilePractice4 {
    public static void main(String[] args) {

        /*
        user has $100
        as long as user has balance more than $0
        ask user that how much money s/he wants to spend
            if the amount is less than balance
                update the balance and show it to user
            if the amount is more than the balance
                print --> "You do not have enough money in the account!! your balance is ..."
         */

        Scanner input = new Scanner(System.in);
        double balance = 100;

        while (balance > 0 ){
            System.out.println("How much money do you want to spend?");
            double spending = input.nextDouble();

        if (spending <= balance){
            balance -= spending;
            System.out.println("Your new balance is " + balance);
        }
        else {
            System.out.println("You do not have enough money in the account!! your balance is " + balance);
        }



    }
}
}
