import java.util.ArrayList;

public class IntersectionofTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {-7, 8};
        int[] b = {-8, -3, 8};
        System.out.println(intersection(a, b));
    }

    static ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();

        int aPointer = 0;
        int bPointer = 0;

        while (aPointer < a.length && bPointer < b.length) {
            // if the elements at both pointers are equal then simply add in result arrayList
            if (a[aPointer] == b[bPointer]) {
                result.add(a[aPointer]);
                int val = a[aPointer];
                // check if the next element is equal to value already added in both arrays, is yes then simply increment both pointers
                while (aPointer < a.length && a[aPointer] == val) aPointer += 1;
                while (bPointer < b.length && b[bPointer] == val) bPointer += 1;
            }
            // if one of the elements is less than other than, increment small element pointer
            else if (a[aPointer] < b[bPointer]) aPointer += 1;
            else bPointer += 1;
        }

        return result;
    }
}
