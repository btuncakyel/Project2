package Java.Methods;

import java.util.Random;

public class Student {

    // create name, lastName, and age field
    //create sleep method this method will take one param for amount of sleep
    // create study method this method will take one param for amount of study
    // create run method with will take one param for amount of run

    // print --> is sleeping .... hours
   //         --> is studying ... hours
    //       -- > is running ... hours


     String name;
    String lastName;
    int age;



    public void sleep(String place){
        int hour = generateHour();

        System.out.println(name + " " + lastName + " is sleeping "+ place+ hour + " hours");
        study(); // since sleep and study methods are non static it can be called without object

    }
    public void study(){

        System.out.println(name + " " + lastName +  " is studying " + generateHour() + " hours");
    }
    public void run(){

        System.out.println(name +" " + lastName + " is running " + generateHour() + " hours");

    }
    //create a generateHour method to get random amount of hour and pass that hour to each of methods(sleep, study, run)

    public int generateHour(){

    Random random = new Random();
    int hour = random.nextInt(10);

    return hour;
    }


    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.lastName = "Sina";
        student1.age = 36;

        student1.sleep("in class ");
        student1.study();
        student1.run();




    }








}
