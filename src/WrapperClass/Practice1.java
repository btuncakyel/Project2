package WrapperClass;

public class Practice1 {

    public static void main(String[] args) {


        byte b1 = 2;

        Byte bt1 = new Byte(b1);
        System.out.println(bt1);   // we convert primitive data type to objects and now we can call methods

        short s1 = 4;
        Short sh1 = new Short(s1);
        Short sh2 = new Short((short) 5);
        System.out.println(sh2);

        Integer i1 = new Integer(12);   // java takes everything as integer

        long l1 = 123;
        Long lg1 = new Long(l1);
        Long lg2 = new Long(123);  // long is capable to store integer

        Double db1 = new Double(3.5);
        System.out.println(db1);

        Float fl1 = new Float(2.5);
        System.out.println(fl1);

        Boolean bl1 = new Boolean(true);
        System.out.println(bl1);

        Boolean bl2 = new Boolean("True");
        System.out.println(bl2 == true);

        Character ch1 = new Character('R');
        System.out.println(ch1);
        char c = 'T';
        Character ch2 = new Character(c);
        Character ch3 = new Character('5');
        //Character ch4 = new Character(65);  // Compile time error
        System.out.println(ch3);

        //AutoBoxing ==> converting primitive data to Object type(wrapper class)

        Integer i2 = 25;
        Boolean bl3 = true;

        //UnBoxing ==> converting Wrapper class object to primitive data

        int a =new Integer(11); // UnBoxing

        char c1 = ch1;  // unboxing
        Character ch4 = ch3;

        double d2 = db1;


    }


}
