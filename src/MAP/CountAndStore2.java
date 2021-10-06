package MAP;

import java.util.HashMap;

public class CountAndStore2 {
    public static void main(String[] args) {

        String string = "It is easy with practice";

        //count the letters

        HashMap<Character, Integer> countLetter = new HashMap<>();

        for (int i = 0; i < string.length(); i++){

            if (string.charAt(i) == ' '){
                continue;                       // it will skip the spaces
            }

            if (!countLetter.containsKey(string.charAt(i))) {
                countLetter.put(string.charAt(i), 1);

            }else {
                countLetter.put(string.charAt(i),countLetter.get(string.charAt(i))+1 );
            }


        }
        System.out.println(countLetter);



    }
}
