import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysListBinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));
        System.out.print(checkIsElementIfPresent(arrayList));
    }

    private static int checkIsElementIfPresent(ArrayList<Integer> arrayList) {
        int result = Collections.binarySearch(arrayList, 6);
        return result >= 0 ? result : -1;
    }
}
