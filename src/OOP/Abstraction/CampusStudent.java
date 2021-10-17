package OOP.Abstraction;

public class CampusStudent extends Student{

    @Override
    public void sleep(){
        System.out.println("On campus student is sleeping");
    }
    @Override
    public void attend(){
        System.out.println("On campus attending in person");
    }
    @Override
    public int studyTime(int hour){
       return 8;
    }

    //Methods should be defined with 'Abstract' keyword and first extending class(first child class)
    //  should implement the abstract methods
    //  that regular child class is called 'Concrete' class
}
