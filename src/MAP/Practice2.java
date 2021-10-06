package MAP;

import java.util.*;

public class Practice2 {
    public static void main(String[] args) {

        HashMap <Integer, String> map = new HashMap<>();

        map.put(1, "des plaines");
        map.put(2, "schaumburg");
        map.put(3, "lake forest");
        map.put(4, "chicago");
        map.put(5, "new york");

        //size();
        System.out.println(map.size());

        // put();  -- > adding
        map.put(null, null);
        System.out.println(map);
        map.put(1, "wilmette");
        System.out.println(map);

        //replace();  --- > updating value
        map.replace(1, "xxxx");   // updating the value
        System.out.println(map);
        map.replace(1,"xxxx","yyyyy");   // changing the value
        System.out.println(map);

        Boolean bl = map.containsKey(2);  // true
        boolean bl1 = map.containsKey(3);  // true
        boolean bl2 = map.containsValue("Washington");  // false
        System.out.println(bl2);

        map.remove(1);
        System.out.println(map);

        System.out.println(map.getOrDefault(2,null));
        System.out.println(map.getOrDefault(6, "--"));


        // print out all values from this map one by one
        // to get all keys from map

        Set<Integer> zipCodes = map.keySet();
        // iterate over the set which contains all the keys(zipcodes)
        System.out.println(zipCodes);

        for (Integer zip : zipCodes){
            System.out.println(map.get(zip));  // pass each key into get() method to get values
        }

        // values();
        // The way to print all values one by one using values(); meyhod

        Collection<String> cities = map.values();
        System.out.println(cities);

        for (String city : map.values()){
            System.out.println(city);
        }

        // clear();  --> it will clear, delete everything
//        map.clear();
//        System.out.println(map);

    }




}
