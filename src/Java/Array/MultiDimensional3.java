package Java.Array;


import java.util.Arrays;

public class MultiDimensional3 {
    public static void main(String[] args) {

        int[] ids = {3,4,2,34,56,7};

        int[][] multiDem = { {60123, 60125, 60345}  , {9123, 9124,9125}  , {5123, 5125, 5126,5124}  };  // outer shows states, inner shows zipcodes of each state

      //  multiDem[2][4] = 5234;  // since there is no 4. index, it throws exception(ArrayIndexOutOfBoundsException)
        System.out.println(Arrays.deepToString(multiDem));

        int[][] multiDem1 = new  int[2][5];  // we  reversed apot here but since we didi not assign the value it will shows 0
        System.out.println(Arrays.deepToString(multiDem1));

    }
}
