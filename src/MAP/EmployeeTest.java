package MAP;

import java.util.HashMap;

public class EmployeeTest {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Zack", "Chicago", 12);
        Employee employee2 = new Employee("Dima", "Denver", 26);
        Employee employee3 = new Employee("Alex", "Zion", 35);
        Employee employee4 = new Employee("David", "new York", 55);

        HashMap<Long, Employee> employees = new HashMap();

        employees.put(employee1.id,employee1);
        employees.put(employee2.id,employee2);
        employees.put(employee3.id,employee3);
        employees.put(employee4.id, employee4);

        //System.out.println(employee1.name);
        printNames(employees);
        printID(employees);
    }


    public static void printNames(HashMap<Long,Employee> map1){

        for (Employee e : map1.values()){

            System.out.println(e.name);
        }

    }

    public static  void printID(HashMap<Long,Employee> map2){
        System.out.println(map2.keySet());
    }

}
