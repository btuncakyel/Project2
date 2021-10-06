package MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Practice4 {
    public static void main(String[] args) {

        HashMap <String, Double> map1 = new HashMap();
        LinkedHashMap <String,Double>map2 = new LinkedHashMap();
        TreeMap <String,Double> map3 = new TreeMap();

        // no order                         // insertion order                     // ascending order
        map1.put("coke", 3.99);             map2.put("coke", 3.99);                 map3.put("coffee", 4.99);
        map1.put("lemon", 1.99);            map2.put("lemon", 1.99);                map3.put("coffee", 4.99);
        map1.put("coffee", 4.99);           map2.put("coffee", 4.99);               map3.put("coffee", 4.99);
        map1.put(null,9.99);                map2.put(null, 9.99);                 //  map3.put(null, 9.99);   // TreeMap does not store the null key

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);




    }



}
