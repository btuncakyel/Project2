package Java.MAP;

import java.util.Random;

public class Employee {

    String name;
    String city;
    int age;
    long id;


    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = generateId();
    }

    public static long generateId(){
        Random random = new Random();

        long idNumber = 0;
        String idNum = "";
        for (int i = 0; i < 6; i++){
        idNum += random.nextInt(10);

        }
        idNumber = Long.parseLong(idNum);
        return idNumber;
    }




}
