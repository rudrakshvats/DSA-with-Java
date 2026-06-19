package Java8StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        List<Integer> result = nums.stream()
                .filter(x -> x % 2 == 0) // filter even numbers
                .map(x -> x * x) // square each number using map
                .collect(Collectors.toList()); // collect into List
        System.out.println(result);
    }
}
