import java.util.ArrayList;
import java.util.Collections;

public class JavaIterator {

    public static void main(String[] args) {
        int[] arr = {1, 6, 9, 2, 11};
        System.out.print(javaIterator(5, 8, arr));
    }

    static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {
        // code here
        ArrayList<Integer> intArrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            intArrayList.add(arr[i]);
        }

        intArrayList.removeIf(integer -> integer < k);

        Collections.sort(intArrayList);

        return intArrayList;
    }
}
