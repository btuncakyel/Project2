package ArrayList;

import Methods.Car;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();

        ArrayList list2 = new ArrayList(3);

        ArrayList list3 = new ArrayList(list1);

        ArrayList<Integer> list4 = new ArrayList();

        ArrayList<Integer> list5 = new ArrayList<Integer>();

        ArrayList<Double> list6 = new ArrayList<Double>();

        ArrayList<Car> list7 = new ArrayList<Car>();

        System.out.println(list2);

        // add method       --> to put elements in our arraylist

        list2.add(11);
        list2.add("white");
        System.out.println(list2);

        list2.add(22);
        System.out.println(list2);
        list2.add(33);
        System.out.println(list2); // [11, white, 22, 33]
        list2.add(2,44);  // if you give index it will insert it and others go down
        System.out.println(list2);  //[11, white, 44, 22, 33]

        //-----------------------------------------------------------

        // size method      -- > it will give size-elements ( start from 1 )

        int list2Size = list2.size();
        System.out.println(list2Size);


        list2.add(5,66);
        System.out.println(list2);   //[11, white, 44, 22, 33, 66]

//        list2.add(8,66);
//        System.out.println(list2);  // IndexOutOfBoundsException

        //---------------------------------------------------------------

        // get()     --> it will get some elements from arraylist

        System.out.println(list2.get(3));  // it will get index 3 which is 22
       // System.out.println(list2.get(10));  // IndexOutOfBoundsException

        //-------------------------------------------------------------------

        // remove();   --- > either you can write the element or you can pass the index of the element

        list2.remove("white");
        System.out.println(list2);
        list2.remove(1);
        System.out.println(list2);
        list2.remove("66");  // if the element is not on the list than nothing is change. we don't have 66 string we have integer 66
        System.out.println(list2);
        list2.add(66);   // if there is a more than one 66 it will remove first one
        list2.remove((Object)66);  // to specify it is not index of 66, we need to specify to remove the object 66
        System.out.println(list2);

        //addAll --> you can add a whole collection to the arrayList/collection

        list3.addAll(list2);  // adding everything in tle list2 will be added in list3
        System.out.println("list3 >> " + list3);
        list3.add(77);
        System.out.println(list3);

        // removeAll --> you can remove a whole collection from an arrayList

        list3.removeAll(list2);  // removeAll in the list three
        System.out.println(list3);  // only 77 which is belong to list3

        list3.add(88);
        list3.add(100);
        System.out.println(list3);  //[77, 88, 100]

        // set(); -- > updating. replacing the element

        list3.set(2,200);  // replace the second index with 200
        System.out.println(list3);   //[77, 88, 200]

        //you can use string methods

        System.out.println(list3.contains(88));
        list3.set(0, "xxxx");
        System.out.println(list3.get(0).toString().startsWith("x"));
        System.out.println(list3);

        // clear();   --> it will clean everything in  the array

        list3.clear();
        System.out.println(list3);













    }




}
