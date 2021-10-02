package SET;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {

        // you are given an array of colors
        // find out and store duplicate elements in to an arrayList from this array

        //String[] colors = {"red", "black", "black", "white", "red", "orange"};

        String[] colors = {"red", "black", "black", "white", "red", "orange"};

        List<Object> colorList = Arrays.asList(colors);
        HashSet hashSet = new HashSet(colorList);
        //HashSet hashSet1 = new HashSet(Arrays.asList(colors));   //second way instead of two line

        System.out.println(hashSet);  // remove duplicate
        System.out.println(colorList);  // original one

        // find out and store duplicate elements in to an ArrayList from this array

        ArrayList list2 = new ArrayList();
        HashSet set2 = new HashSet();

        for (String color : colors){

            if (!set2.add(color)){
                list2.add(color);
            }
        }
        System.out.println(list2);  // print the duplicates elements






    }



}
