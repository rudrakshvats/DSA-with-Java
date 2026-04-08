import java.util.Arrays;
import java.util.HashSet;

public class SortedFrequency {
    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 2, 1, 4};
        freqSorted(arr);
    }

    public static void freqSorted(int arr[]) {
        // Your Code Here
        Arrays.sort(arr);
        HashSet<Integer> uniqueElementsSet = new HashSet<>();
        for (int k : arr) {
            uniqueElementsSet.add(k);
        }
        int countElement;
        int count = 0;
        for (Integer i: uniqueElementsSet) {
            countElement = i;
            for (int j = 0; j < arr.length; j++) {
                if (countElement == arr[j]) {
                    count += 1;
                }
            }
            System.out.println(countElement + " " + count);
            count = 0;
        }
    }
}
