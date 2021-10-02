package SET;


import java.util.*;

public class Practice2 {
    public static void main(String[] args) {

        HashSet <Integer> hashSet = new HashSet<>();

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        TreeSet<Integer> treeSet = new TreeSet();

        // null, random order                                                           null, insertion order                                   no null, ascending order
        hashSet.add(99);                                                                linkedHashSet.add(28);                                  treeSet.add(39);
        hashSet.add(12);                                                                linkedHashSet.add(27);                                  treeSet.add(32);
        hashSet.add(55);                                                                linkedHashSet.add(23);                                  treeSet.add(35);
        hashSet.add(14);                                                                linkedHashSet.add(24);                                  treeSet.add(36);
        hashSet.add(null);                                                              linkedHashSet.add(null);                              //treeSet.add(null);
        System.out.println(hashSet);                                                    System.out.println(linkedHashSet);                      System.out.println(treeSet);


        // since it is object we can store null inside integer

        for (Integer number : treeSet){

            boolean b = number.toString().equalsIgnoreCase("35");
            System.out.println(b);
            String str = number == 35 ? "I found 35" : "I could not find 35";
            System.out.println(str);
        }
        // [32, 35, 36, 39]

        Iterator iterator = treeSet.iterator();

        while (iterator.hasNext()) {     //check the next element

            System.out.println(iterator.next());

        }
        ArrayList<String> veggies = new ArrayList<>();
        veggies.add("tomato");
        veggies.add("lettuce");
        veggies.add("carrot");
        veggies.add("carrot");


        // looping over arrayList by using iterator
        Iterator iterator1 = veggies.iterator();

        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        //sorting collection via sort() method
        Collections.sort(veggies);
        System.out.println(veggies);

        //convert arrayList to set
        HashSet set1 =new HashSet(veggies);
        System.out.println("this is list to set: " + set1);

        // set to arrayList
        ArrayList list1 = new ArrayList(set1);
        System.out.println("This is new arrayList from set: " + list1);

        list1.add("tomato");
        System.out.println("after adding tomato once again: " + list1);
        System.out.println(list1.get(1));



    }
}
