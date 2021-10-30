package Java.ArrayList;

import java.util.ArrayList;

public class Practice2 {

    public static void main(String[] args) {

        //create an arrayList to store 5 colors
        //store 5 diff colors in that arrayList
        //use traditional for loop to print out each element from arrayList


        ArrayList<String> colors = new ArrayList<>();

        colors.add("White");
        colors.add("Black");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Green");
        System.out.println(colors);


        for (int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }
        for (String color : colors){
            System.out.println("This from fro each group " + color);
        }
        // name your method as >> printFruits
        // create a method that will take an arrayList as parameter
        //print the elements if they have 5 or more letter

        ArrayList <String> fruitsNames = new ArrayList<>();

        fruitsNames.add("kiwi");
        fruitsNames.add("apple");
        fruitsNames.add("plum");
        fruitsNames.add("banana");
        fruitsNames.add("pineapple");

        printFruits(fruitsNames);

        //if the method is not static we need to create an object and call the method
        //Practice2 object = new Practice2();
        //object.printFruits(fruitNames);

    }

    public static void printFruits(ArrayList<String> fruits){

        for (String fruit : fruits){
            if (fruit.length() >= 5){
                System.out.println(fruit);
            }
        }
    }
    //remove the short fruit names from the arrayList

    public void printFruit(ArrayList<String > fruits){
        for (int i = 0; i < fruits.size(); i++){
            if (fruits.get(i).length() <= 5){
                fruits.remove(i);
            }else {
                System.out.println(fruits.get(i));
            }
        }
        System.out.println(fruits);
    }


}