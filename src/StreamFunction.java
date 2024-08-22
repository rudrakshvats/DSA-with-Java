import java.util.*;
import java.util.stream.Collectors;

public class StreamFunction {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Rudraksh", 310182, "IT"));
        employees.add(new Employee("Vinay", 316818, "Accounts"));
        employees.add(new Employee("Shishupal", 310185, "IT"));
        employees.add(new Employee("Ramdev", 310186, "Fraud"));
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList())).entrySet().stream().forEach(x -> System.out.println(x.getKey() + " - " + x.getValue().size()));
        /*
        Now suppose we want to get only string parameters as a list like getting only names of employees then we can use the following tables
         */
        List<String> names = employees.stream().map(Employee::getName).collect(Collectors.toList());
        /*
        here we have used map() method which will filter out only names as we have passed getName() function
        of Employee class and then collected all the String values to list
         */
    }

    public static class Employee {
        private String name;
        private Integer code;
        private String department;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public Employee(String name, Integer code, String department) {
            this.name = name;
            this.code = code;
            this.department = department;
        }
    }
}
