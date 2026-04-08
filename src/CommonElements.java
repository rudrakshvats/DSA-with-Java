import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int[] a = {80, 37, 59, 20, 8, 20, 8, 91, 28, 81, 89, 88, 21, 47, 99, 99, 92, 84, 88, 53, 44, 61, 28, 84, 31, 9, 63, 98, 36, 61, 100, 16, 44, 70, 44, 74, 46, 91,
                5, 96, 23, 6, 31, 79, 34, 92, 30, 81, 53, 21, 2, 8};
        int[] b = {10, 4, 7, 8, 8 ,7, 1, 6, 7, 1, 1, 1, 7, 7, 7, 6, 1, 9};
        System.out.println(getCommonElements(a, b));
    }

    private static ArrayList<Integer> getCommonElements(int[] a, int[] b) {
        ArrayList<Integer> commonList = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < b.length; j++) {
                if (a[i] == b[j]) {
                    commonList.add(a[i]);
                    break;
                }
            }
        }

        return commonList;
    }
}
