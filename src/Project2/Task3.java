package Project2;

public class Task3 {

    public static void main(String[] args) {


        double  balance = 2.36;
        double dollarToQuarter = balance/0.25;
        double rem1 = dollarToQuarter%0.25;



        double dollarToDimes = balance/0.1;
        double rem2 = rem1%0.1;

       double dollarToNickles = balance/0.05;
        double rem3 = rem2%0.05;

        double dollarToPennies = balance/0.01;
        double rem4 = rem3%0.01;




        float result1 = (float) Math.round((dollarToQuarter)*100)/100;
        float result2 = (float) Math.round((rem2)*100)/100;
        float result3 = (float) Math.round((rem3)*100)/100;
        float result4 = (float) Math.round((rem4)*100)/100;



        System.out.println(balance + " dollar " + result1 + " quarter " + result2 + " dimes " + result3 + " nickles  " + result4 + " pennies");

       // ============================================================================================

        double total = 2.36;

        double quarter =(int)(total/0.25);
        total = total - (quarter*0.25);


        double dimes = (int)(total/0.1);
        total = total - (dimes*0.1);

        double nickles = (int)(total/0.05);
        total = total - (nickles*0.05);

        double pennies = (int)(total*0.01);
        total = total - (pennies*0.01);

        //System.out.println(balance + " dollar " + );

        double Dollar=2.36;
        double totalPenny=Dollar*100;
        System.out.println(totalPenny);
        int quarterr= (int)( totalPenny/25);
        System.out.println(quarter);
        totalPenny=totalPenny-quarter*25;
        System.out.println(totalPenny);
        int dime= (int)(totalPenny/10);
        System.out.println(dime);
        totalPenny=totalPenny-dime*10;
        System.out.println(totalPenny);
        int nickel=(int)(totalPenny/5);
        System.out.println(nickel);
        System.out.println(totalPenny);
        System.out.println(Dollar+" will make "+ quarter+" quarters "+ dime+ " dime "+ nickel+ " nickel and " + totalPenny+" pennies");

    }
}
