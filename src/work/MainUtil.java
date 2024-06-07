package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainUtil {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Mike");
        emp1.setCity("Bengluru");
        emp1.setSalary(10000);

        Employee emp2 = new Employee();
        emp2.setName("Chennai");
        emp2.setSalary(5000);

        Employee emp3 = new Employee();
        emp3.setName("Smith");
        emp3.setCity("Bengluru");
        emp3.setSalary(10000);

        Employee emp4 = new Employee();
        emp4.setName("Adam");
        emp4.setCity("Delhi");
        emp4.setSalary(8000);

        List<Employee> data = Arrays.asList(emp1, emp2, emp3, emp4);
        //Check how many employee whose salary is 5000
//       List<Employee> newdata = data.stream().filter(e -> e.getSalary() == 10000).collect(Collectors.toList());
////        System.out.println(newdata.size());
//
//        // if i want to print all the details of employee whose salary is 10000
//        for (Employee employee : newdata){
//            System.out.println(employee.name);
//            System.out.println(employee.city);
//            System.out.println(employee.salary);
//        }

        //wap to print all details of employee whose lives Delhi
        List<Employee> newdata1 = data.stream().filter(e ->e.getCity()=="Delhi").collect(Collectors.toList());
//
         for (Employee employee : newdata1) {
            System.out.println(employee.name);
            System.out.println(employee.city);
            System.out.println(employee.salary);
        }

    }
}
