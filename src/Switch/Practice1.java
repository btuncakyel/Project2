package Switch;

public class Practice1 {
    public static void main(String[] args) {


        int number = 25;
        switch (number) {

            case 3:
                System.out.println("First");
                break;
            case 25:
                System.out.println("Second");
                break;
            case 4:
                System.out.println("Third");
                break;
            case 5:
                System.out.println("Fourth");
                break;

            default:
                System.out.println("This is default");

                //we we don't put 'break' it will show in console second, third, fourth
                // default --> if none of the case does not work then default will be executed
                //default can be anywhere (at the beggining or middle) but we need to break otherwise it will execute the nextline
        }

    }
}