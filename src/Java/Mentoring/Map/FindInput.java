package Java.Mentoring.Map;

import java.util.*;

public class FindInput {

    /*
    Example Java.String[] logs= new Java.String[]{
  "A:1"
  "C:2"
  "B:3"
  "A:3"
  "C:1"
  "A:2"
  "A:1"
  "B:2"
  "B:3"
  "C:2"
  }
 In this array numbers represent the user ids and letters represent the inputs from user. Write function to find when users three consequences input makes
 ABC. For example, in this case we just need to print out 2 because if we check the inputs from user, only user 2's input contains ABC.
     */

    public static void findInputs(String[] logs) {
        Map<String, String> map = new HashMap();

        for (int i = 0; i < logs.length; i++) {
            // logs[i]  "A:2"
            String[] idInput = logs[i].split(":");
            // idInput[0]="A" idInput[1]="2"
            // First element from this string is input second string from
            // this array is id
            if (!map.containsKey(idInput[1])) {
                map.put(idInput[1], idInput[0]);

            } else { String previousInput = map.get(idInput);
                map.put(idInput[1], previousInput + idInput[0]);


            }
        }
        System.out.println(map);
    }

}
