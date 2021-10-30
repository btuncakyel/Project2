package Java.OOP.Abstraction;

public abstract class Student {

    String name;
    int age;

    public Student (){

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //    public static void main(Java.String[] args) {
//
//        Student student = new Student();   // you cannot create a object in abstract class
//
//    }

    public void study(){    // regular method
        System.out.println("Student is studying");
    }   //regular method

    public abstract void attend();

    public abstract void sleep();

    public abstract int studyTime(int hour);


}
