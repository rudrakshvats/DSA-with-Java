package Java8StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SampleQuestion1 {
    public static final String DIGITAL_FINANCE = "Digital Finance";

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Rudraksh", "SF", 100000D);
        Employee employee2 = new Employee(2, "Subham", "SF", 150000D);
        Employee employee3 = new Employee(3, "Ankush", DIGITAL_FINANCE, 160000D);
        Employee employee4 = new Employee(4, "Abhay", DIGITAL_FINANCE, 155000D);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        // Problem 1, use filter() and collect()
        System.out.println("Employees in Digital Finance Department are: ");
        List<Employee> digitalFinanceEmployees = employees.stream().filter(x -> x.department.equalsIgnoreCase(
                DIGITAL_FINANCE)).collect(Collectors.toList());
        digitalFinanceEmployees.forEach(System.out::println);
        System.out.println();

        // Problem 2, use sorted() and Comparator
        System.out.println("Employees ordered in increasing order of salary: ");
        List<Employee> increasingSalaries = employees.stream().sorted(Comparator.comparingDouble(a -> a.salary)).collect(Collectors.toList());
        increasingSalaries.forEach(System.out::println);

        // Problem 3, use groupingBy() and counting()
        System.out.println("Employees grouped by salary bracket");
        Map<String, Long> salaryWiseEmployees =
                employees.stream().collect(Collectors.groupingBy(x -> (x.salary >= 150000D ? "Above or equal 1.5 LPA" :
                                "Below" +
                                                                                                               " 1.5 " +
                                                                                                               "LPA"),
                        Collectors.counting()));
        salaryWiseEmployees.forEach((key, value) -> System.out.println(key + " " + value));
    }
}

class Employee {
    long id;
    String name;
    String department;
    double salary;

    public Employee(long id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id = " + id + ", name = " + name + ", department = " + department + ", salary = " + salary +
                "]";
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }
}
