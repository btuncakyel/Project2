package Constructor;

public class EmployeeTest {

    public static void main(String[] args) {

   Employee employee1 = new Employee();  //second way to initialize the instance variables (create object)
   employee1.name = "Zack";
   employee1.age= 25;
   employee1.setEmployeeId(11);
   System.out.println(employee1.employeeId);

   Employee employee2 = new Employee("female");
       System.out.println(employee2.gender);

       System.out.println(employee1); // it will shows hashcode
       System.out.println(employee2); // it will shows hashcode

       employee1.info();

}
}