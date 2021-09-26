package Constructor;

public class Employee {

    String name;
    int age;
    int employeeId;
    String gender;
    String companyName = "Techtorial"; // first way to initialize the instance variable(use default)

    public  void info(){
        System.out.println(name + age + employeeId + gender + companyName);
    }

    public int setEmployeeId(int id){
        employeeId = id;
        return employeeId;

        // third way to initialize the instance variable(set method)
    }

    public Employee(){
        // if there is no parameter -- > no argument
    }
    public Employee(String newGender){
        gender = newGender;
        // this is a forth way to initialize the instance variables.


    }

}
