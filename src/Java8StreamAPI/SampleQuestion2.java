package Java8StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class SampleQuestion2 {
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

        // Problem 1, using max() and Comparator
        Optional<Employee> maxSalariedEmployeeOptional =
                employees.stream().max(Comparator.comparing(Employee::getSalary));
        StringBuilder stringBuilder = new StringBuilder();
        Employee maxSalariedEmployee = maxSalariedEmployeeOptional.get();
        stringBuilder.append(maxSalariedEmployee.name).append(" earns highest salary ").append(maxSalariedEmployee.salary);
        System.out.println(stringBuilder + "\n");

        // Problem 2, using groupingBy()
        Map<String, Long> departmentWiseEmployees = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        departmentWiseEmployees.forEach((s, count) -> System.out.println(s + " " + count));

        // Problem 3, using sorted() and Comparator.reverseOrder()
        System.out.println("\nEmployees order in descending order of salary ");
        List<Employee> employeesInDescendingOrderOfSalary =
                employees.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder())).collect(Collectors.toList());
        employeesInDescendingOrderOfSalary.forEach(System.out::println);

        // Problem 4, using groupingBy() and maxBy()
        System.out.println("\nHighest paid employees in each department: ");
        Map<String, Optional<Employee>> highestEmployeesInEachDepartment =
                employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        highestEmployeesInEachDepartment.forEach((s, employee) -> {
            employee.ifPresent(highestSalaryEmployee -> System.out.println("In " + s + " department: " + highestSalaryEmployee.name + " earns the highest " + highestSalaryEmployee.salary));
        });
    }
}
