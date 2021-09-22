package Array;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

        int[] zipCodes = {123, 456, 234,};

        System.out.println(zipCodes.length);  // 3
        System.out.println(zipCodes[0]);     // 123
        //System.out.println(zipCodes[5]);     // ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(zipCodes));  // shows all

        zipCodes[1] = 999;
        System.out.println(Arrays.toString(zipCodes));

        //----------------------------------------------------------------------------------
        System.out.println("--------------------------------");

        Object[] objects = {"Red", "Blue", 55, 'A', 6.57, null, false};       // because objects covers primitives and objects

        for (int i = 0; i < objects.length; i++){
            System.out.println(objects[i]);

        }
        //----------------------------------------------------------------

        boolean[] conditions = {true, false, false, false, false, true, 5==5, 5!=5};
        System.out.println(Arrays.toString(conditions));

        char[] characters = {'a', '$', '!', 'D', '7', '1', 65};
        System.out.println(Arrays.toString(characters));

        int[] chars = {'A'};
        System.out.println(Arrays.toString(chars));




    }
}
