package Project2;

public class ValueOfNumber {

    public static void main(String[] args) {

        //TASK 2
        //Write program will add up the value of a number of quarters, dimes, nickels, and pennies.
        //The number of each type of coin is input by the user.
        //The total value is printed in dollars.

        float quarter = 5;
        float dimes = 4;
        float nickle = 3;
        float pennies = 2;

        float quarterToDollar = quarter*0.25f;
        float dimesToDollar = dimes*0.1f;
        float nickleToDollar = nickle*0.05f;
        float penniesToDollar = pennies*0.01f;
        float result = (float) Math.round((quarterToDollar+dimesToDollar+nickleToDollar+penniesToDollar)*100)/100;

        System.out.println(result);




    }
}
