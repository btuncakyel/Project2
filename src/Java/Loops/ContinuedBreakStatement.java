package Java.Loops;

public class ContinuedBreakStatement {
    public static void main(String[] args) {

        OUTER:
       for (int number = 0; number < 15; number++){

           if (number == 4){
              break;      //it will stop at 4
           }

           for (char ch = 'A'; ch < 'H'; ch++){

               if (number == 4){
                 ///  break;       // if break is out of the first/larger loop, it will skipped 4 and continued
                   break OUTER;   // but this is behave like first one. it will stop at 4. is behave like in larger loop
                                      //word OUTER is only for labelling purpose
                                      // break statement will stop the execution for curtain condition
               }
               if (ch == 'C'){
                   continue ;  // it will skipped letter C
               }
               if (ch == 'C' || ch == 'D') {
                   continue;   //it will skipped C and D. we need to use ||. not &&
               }
               System.out.print(number);
               System.out.println(ch);

           }
           System.out.println();
       }







    }
}
