package Java.MAP;

import java.util.HashMap;

public class CountAndStore {
    public static void main(String[] args) {

        String[] brands = {"Nike", "Adidas", "Reebok", "Puma", "Armani", "Clarks", "Nike", "Puma"};

        // nike -- 2
        //adidas -- 1
        // reebok -- 1
        // puma -- 3

        HashMap < String, Integer> brandCount = new HashMap<>();

        for (int i = 0; i < brands.length; i++){

            if (!brandCount.containsKey(brands[i])){
                brandCount.put(brands[i], 1);
            }else {

                brandCount.put(brands[i], brandCount.get(brands[i])+1);
            }
        }
        System.out.println(brandCount);




    }
}
