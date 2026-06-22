package Java8StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByAndCountingExample {
    public static void main(String[] args) {
        List<String> names =
                Arrays.asList("Ram", "Shyam", "Ram", "Mohan", "Shyam");
        Map<String, Long> collect = names.stream().collect(
                Collectors.groupingBy(String::valueOf, // Group names by value
                        Collectors.counting())); // Count occurrences of each name
        System.out.println(collect);
    }
}
