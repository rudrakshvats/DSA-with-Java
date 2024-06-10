import java.util.*;

public class DuplicateRowCount {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee("Rudraksh", 25);
        employeeList.add(employee1);
        Employee employee2 = new Employee("Shubham", 25);
        employeeList.add(employee2);
        Employee employee3 = new Employee("Rudraksh", 25);
        employeeList.add(employee3);
        int count = Collections.singleton(employeeList.stream().allMatch(new HashSet<>()::add)).size();
        System.out.println("Duplicate found " + count + " times");
    }

    public static class Employee {

        private String name;
        private Integer age;

        public Employee(String name, Integer age) {
        }
    }
}
