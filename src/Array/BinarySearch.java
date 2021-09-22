package Array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        //Binary Search

        // binarySearch will return index number if the element is present in the array
        //if the element is not in the array, it will return possible element t position with negative sign
        //you need to sort the array before you apply binary search

        int[] studentNumber = {100,10, 15,20,30,35};

        Arrays.sort(studentNumber);
        System.out.println(Arrays.toString(studentNumber));
        System.out.println(Arrays.binarySearch(studentNumber, 35));
        System.out.println(Arrays.binarySearch(studentNumber, 25));  // since there is no 25 it will start from 1
                                                                        // and it will guess the location where 25 can be (it will be negative)
        System.out.println(Arrays.binarySearch(studentNumber, 111));  // -7




    }
}
