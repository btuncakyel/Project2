package ArrayList;

import Constructor.Cup;

import java.util.Arrays;
import java.util.List;   // you can use '*' to shows all.---->  import java.util.*;  // it will shows all which coming from util class

public class ArrayToArrayList {
    public static void main(String[] args) {

        Object[] objects = {2, true, "yes", "no", 2.5, new Cup()};

        //How to convert array to ArrayList

        List<Object> list = Arrays.asList(objects);

        System.out.println(list.size());

        // list.add("new element");   //UnsupportedOperationException
        System.out.println(list);
       // list.remove("yes");
        System.out.println(list);    //UnsupportedOperationException

        List<Object> list1 = Arrays.asList(1,2,3,4);
        System.out.println(list1);

        //list1.add(5);  //UnsupportedOperationException
        list1.set(0,100);
        System.out.println(list1);



    }
}
