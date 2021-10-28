package Java.Methods;

public class NetFlix {

    // create a instance fields: accountName, userName, monthlyData
    // create a method that will update usage of the data for each user that uses
    // this method will take a parameter for amount of data usage

    String accountName;
    String userName;
    static double monthlyData = 256;

    public void usage (double data){
        monthlyData -= data;
        System.out.println("You have " + monthlyData + " data ");
    }


    public static void main(String[] args) {
        NetFlix flix = new NetFlix();
        flix.usage(12);
        System.out.println(monthlyData);
        System.out.println(flix.accountName);  // since userName is nato static we cannot call it. we need to call with object
        flix.usage(10);
        System.out.println(flix.monthlyData);

        NetFlix net = new NetFlix();
        net.usage(2);
        System.out.println(net.monthlyData);
    }

}
