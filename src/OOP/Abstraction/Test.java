package OOP.Abstraction;


public class Test {
    public static void main(String[] args) {

    //Student student = new Student();
        // we cannot create a object when the class is abstract

   // SelfLearner selfLearner = new SelfLearner();
        //Selflearner class is extend from abstarct class

      CampusStudent campusStudent = new CampusStudent();
       // Concrete class(first regular class after the abstract class( child) can have a object

        campusStudent.study();
        campusStudent.studyTime(8);
        campusStudent.attend();

        Sorin sorin = new Sorin();
        sorin.speak();
        sorin.attend();

        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.studyTime(10);

        // Lazy lazy = new Lazy();  // it is a abstract class we cannot create object





    }

}
