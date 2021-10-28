package Java.WrapperClass;

public class StringToWrapper {
    public static void main(String[] args) {

        String str1 = "12345";

        Integer i1 = Integer.valueOf(str1);  // give object

        System.out.println(i1);  // 12345

        String str2 = "5.9";

        Float fl1 = Float.valueOf(str2);
        System.out.println(fl1);

        String str3 = "False";
        Boolean bl1 = Boolean.valueOf(str3);
        System.out.println(bl1);

        String str4 = "c";
       // Character.valueOf(str4);  // compile time error. you cannot convert to Java.String value to character object




    }
}
