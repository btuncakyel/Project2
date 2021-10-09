package Blocks;

public class Practice1 {


    int number;
    static int id;

    {
        number = 99;   // you are initializing default which means every object in class will use
        System.out.println("Instance block");
    }

    static {
        id = 25;  // it will better to initialize static instance variable inside if the static block
        System.out.println("Static block");
    }


    // static belongs to class and it will run once. since you hve one class, it will run once
    // instance blocks is belongs to object.  it depends on  how many object you create



}
