package Java.Loops;

public class PerfectNumber {
    public static void main(String[] args) {


        //  perfect number: a number is equals to its dividers' (except number itself) sum
        // 6 >> 1,2,3 >> 1+2+3 =6   6 = 6 is perfect number

        int perfectN = 6;
        int sum = 0;

        for (int divisor = 1; divisor < perfectN; divisor++){

            if (perfectN % divisor == 0){
                sum += divisor;
            }
        }
        System.out.println("The sum is >> " +sum);

        if (perfectN == sum){
            System.out.println("The number " + perfectN + " is a perfect number");

        }else {
            System.out.println("The number " + perfectN + " is not perfect number");
        }
    }
}
