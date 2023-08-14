package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2DArray {
    public static void main (String[] args) {
        Integer[][] intArray = {{8, 7, 6, 5}, {4, 3, 2, 1}};
        /*
        Traversing through rows of array
         */
        Arrays.sort(intArray, Comparator.comparingDouble(a -> a[0]));
        int size = intArray.length - 1;
        while (size >= 0) {
            Arrays.sort(intArray[size]);
            size -= 1;
        }

        System.out.println(Arrays.deepToString(intArray));
    }
}
