package Java.MAP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {

        HashMap <String, String> map = new HashMap<>();
        HashMap <String, Double> map1 = new HashMap<>();
        HashMap <String, HashSet<Integer>> map2 = new HashMap<>();
        HashMap <HashMap <String, Integer>, String> map3 = new HashMap<>();


        map.put("11", "David");
        map.put("22","Alex");
        map.put("33", "Sorin");

        System.out.println(map);
        map.put("33", "Zack");
        System.out.println(map);  // keys are unique, it will reassign

        map.put("44", "Alex");  // value can be duplicate

        map.put(null, "jenny");
        System.out.println(map);
        map.put(null, "Arzu");  // key is unique even it is null it will reassign it
        System.out.println(map);

        map.put("55", null);
        map.put("66", null);
        map.put("77", null);
        System.out.println(map);   // value can be duplicate but key is unique

        // get()
        System.out.println(map.get("22"));   // Alex
        String numValue = map.get(null);    // we can store the value and then use it whatever we want
        System.out.println(numValue.concat("***"));

        map.get(null).concat("!!!");

        // keySet();  -- > it will bring all keys

        Set <String> keys =  map.keySet();   // since Set is a unique key are also unique and keySet bring unique key. keySet return type is  Set.
        System.out.println(keys);
        System.out.println("=============================");

        // since set method does not have the index, we cannot use the traditional for loop.
        //  instead that we can use for each loop to get all the values
      for (String key : keys){
          System.out.println(map.get(key));
      }

    }
}
