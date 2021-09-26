package WrapperClass;

public class StringToPrimitives {

    public static void main(String[] args) {

        String str1 = "123";

        int i = Integer.parseInt(str1);  // it will convert to string to integer

        double db2 = Double.parseDouble(str1);  // convert string to double

        String str2 = "true";

        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);

        boolean b2 = Boolean.parseBoolean(str1);
        System.out.println(b2);

        boolean b3 = Boolean.parseBoolean("False");
        System.out.println(b3);

        String str3 = "A";
        //Character.parseCharacter(str3); // it will not work since there is no parse method for Character



    }


}
