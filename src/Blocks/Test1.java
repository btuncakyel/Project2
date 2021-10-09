package Blocks;

public class Test1 {

    public static void main(String[] args) {

        Practice1 obj1 = new Practice1();
        Practice1 obj2 = new Practice1();
        Practice1 obj3 = new Practice1();

        // since there is a three object -- > "Instance variable" will be printed 3 time
        // since static is belongs to class it will work once. it will printed one time

        System.out.println(obj1.number);
        System.out.println(obj1.id);
        System.out.println(obj2.number);
        System.out.println(obj2.id);

        obj1.number = 44;
        System.out.println("==================================");
        System.out.println(obj1.number);
        System.out.println(obj1.id);
        System.out.println(obj2.number);
        System.out.println(obj2.id);
        System.out.println("===========================");
        obj1.id = 55;
        System.out.println(obj1.number);
        System.out.println(obj1.id);
        System.out.println(obj2.number);
        System.out.println(obj2.id);


    }

}
