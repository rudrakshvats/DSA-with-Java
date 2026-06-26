package Java8StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class SampleQuestion3 {
    public static final String DIGITAL_FINANCE = "Digital Finance";

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Rudraksh", "SF", 100000D);
        Employee employee2 = new Employee(2, "Subham", "SF", 150000D);
        Employee employee3 = new Employee(3, "Ankush", DIGITAL_FINANCE, 160000D);
        Employee employee4 = new Employee(4, "Abhay", DIGITAL_FINANCE, 155000D);
        Employee employee5 = new Employee(2, "Subham", "SF", 15000D);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        // Find duplicate elements from a list using groupingBy(), counting() and filter()
        Map<String, Long> groupedElements =
                employees.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        List<Map.Entry<String,
                Long>> duplicateRecords =
                groupedElements.entrySet().stream().filter(a -> a.getValue() > 1).collect(Collectors.toList());
        if (!duplicateRecords.isEmpty()) {
            System.out.println("Duplicate Records found for Employee with name: " + duplicateRecords.get(0).getKey());
        }

        // Partition employees based on salary (e.g., salary > 50,000) using partitioningBy()
        Map<Boolean, List<Employee>> collect = employees.stream().collect(Collectors.partitioningBy(x -> x.salary > 50000D));
        collect.forEach((s, employeeList) -> System.out.println("\n" + s + " " + employeeList));

        // Find the second-highest salary employee using sorted(), skip() and findFirst()
        Optional<Employee> secondHighestOptional = employees.stream().sorted(Comparator.comparing(Employee::getSalary,
                Comparator.reverseOrder())).skip(1).findFirst();
        if (secondHighestOptional.isPresent()) System.out.println("\nEmployee with second highest salary is: " + secondHighestOptional.
                get().name);
    }
}
