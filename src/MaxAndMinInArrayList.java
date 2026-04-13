import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class MaxAndMinInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 4, 2, 1));
        System.out.println("Max : " + maximumElement(arrayList));
        System.out.println("Min : " + minimumElement(arrayList));
    }

    public static int maximumElement(ArrayList<Integer> arr) {
        // Your code here
        Optional<Integer> max = arr.stream().max(Integer::compareTo);
        return max.orElse(0);
    }

    public static int minimumElement(ArrayList<Integer> arr) {

        // Your code here
        Optional<Integer> min = arr.stream().min(Integer::compareTo);
        return min.orElse(0);
    }
}
