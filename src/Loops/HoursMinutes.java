package Loops;

import java.awt.*;

public class HoursMinutes {
    public static void main(String[] args) {

        /*
        create a digital clock that prints hours and minutes
        >> hours from 0 to 11 inclusive
        >>minutes from 0 to 59 included
        0 : 0
        0 : 1
        0 : 2
        0: 3
        skip hours >> 5,6,7 in the execution
        stop the execution for 10 and after 10
         */
        for (int a = 0; a < 2; a++)
            if (a == 0){
                continue;   // if we do continued here it skip all am
            }
            LABEL:
                    for (int hours = 0; hours <= 11; hours++) {
                        if (hours > 4 && hours < 8) {
                            continue;
                        }
                        if (hours == 10) {
                            break;    //  it will stop at 10
                        }
                        for (int minutes = 0; minutes <= 59; minutes++) {
                            if (hours >= 10) {
                                break LABEL;  // it will work as outer. it will stop at 10
                            }
                         //   if (a == 0) {
                                System.out.println(hours + " : " + minutes + " am");
                        //    } else {
                               System.out.println(hours + " : " + minutes + " pm ");
                          //  }

                        }

                    }
    }
}
