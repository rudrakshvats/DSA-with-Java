package Java8StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDistinctAndSortedExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,2,2,7,1,5);
        System.out.println("Original List -> " + nums);
        Stream<Integer> distinctStream = nums.stream().distinct(); // Remove duplicates
        System.out.println("After removing duplicates - > " + distinctStream.collect(Collectors.toList()));
        Stream<Integer> ascendingStream = nums.stream().distinct().sorted(); // Sort ascending
        Stream<Integer> descendingStream = nums.stream().distinct().sorted((a, b) -> b - a); // Sort descending
        System.out.println("In ascending order -> " + ascendingStream.collect(Collectors.toList())); // Collect results into List
        System.out.println("In descending order -> " + descendingStream.collect(Collectors.toList()));
    }
}
