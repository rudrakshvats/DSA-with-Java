import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRowCount {
    public void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee("Rudraksh", 25);
        employeeList.add(employee1);
        Employee employee2 = new Employee("Shubham", 25);
        employeeList.add(employee2);
        Employee employee3 = new Employee("Rudraksh", 25);
        employeeList.add(employee3);
        int count = 0;
        for (Employee employee: employeeList) {
            count = employeeList.stream().filter(x -> x.name.equals(employee.name)).filter(x -> x.age.equals(employee.age)).collect(Collectors.toList()).size();
        }
        System.out.println("Duplicate found " + count + " times");
    }

    public class Employee {
        private String name;
        private Integer age;

        public Employee() {
        }

        public Employee(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }
}
