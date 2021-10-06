package MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentInfo {
    public static void main(String[] args) {



    HashMap<String, String> student = new HashMap<>();

        student.put("first name", "David");
        student.put("LastName", "Pena");
        student.put("Age", "25");
        student.put("Gender", "M");
        student.put("City", "Chicago");


    HashMap<String, String> student2 = new HashMap<>();

        student2.put("first name", "Jeremiah");
        student2.put("LastName", "Michaelson");
        student2.put("Age", "15");
        student2.put("Gender", "M");
        student2.put("City", "High Park");

    HashMap<String , String> student3 = new HashMap<>();

        student3.put("first name", "Micheal");
        student3.put("LastName", "White");
        student3.put("Age", "35");
        student3.put("Gender", "M");
        student3.put("City", "Winnetka");


    HashMap<String , String > student4 = new HashMap<>();

        student4.put("first name", "Sarah");
        student4.put("LastName", "Star");
        student4.put("Age", "29");
        student4.put("Gender", "M");
        student4.put("City", "Chicago");


        List<HashMap<String ,String >> list = new ArrayList<>();

        list.add(student);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        System.out.println(list);


        // if student less than 20, shows their name

      for (int i = 0; i < list.size(); i++){

         if (Integer.parseInt (list.get(i).get("Age")) < 20) {
             System.out.println(list.get(i).get("first name"));
         }

      }
      //print out element from map as pairs key - values

        for (int i = 0; i < list.size(); i++){

            System.out.println(list.get(i).entrySet());

        }

    }

}
