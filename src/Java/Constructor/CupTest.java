package Java.Constructor;

public class CupTest {

    public static void main(String[] args) {

        Cup c1 = new Cup(12,true,8);

        System.out.println(c1.isClean);
        System.out.println(c1.liquidAmount);
        System.out.println(c1.size);

        Cup c2 = new Cup();
        System.out.println(c2.liquidAmount);

        System.out.println(c1); // show hashcode
        System.out.println(c2);

        c1.info(); // since we create a method for all info we will see info not hashcode
        c2.info();

        Cup c3 = new Cup(16,true,12);
        System.out.println(c3);


        c1 = null;
        Cup c4 = c1; // reassigning
        // this two are garbage. whole object is gone

        Cup c5 = new Cup(22,false);
        c5 = null;
        System.gc();




    }




}
