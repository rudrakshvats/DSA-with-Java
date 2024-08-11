import java.util.Arrays;

public class JDKSortingMethods {
    public static void main(String[] args) {
        Integer[] intArray = {3, 8, 1, 0, -5, 7, 2};
        Arrays.sort(intArray);
        System.out.println("Arrays.sort() -> " + Arrays.toString(intArray));
        Arrays.parallelSort(intArray);
        System.out.println("Arrays.parallelSort() -> " + Arrays.toString(intArray));
    }
}
