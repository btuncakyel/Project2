package Java.ArrayList;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("x");
        list.add("y");
        list.add("z");
        list.add("t");
        System.out.println(list);

        list.add(2,"t");
        System.out.println(list);

        list.remove("t");
        System.out.println(list);




    }
}
