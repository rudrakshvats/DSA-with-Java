import java.util.Arrays;

public class Segregate0And1 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregate0and1(arr);
    }

    static void segregate0and1(int[] arr) {
        // code here
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex < rightIndex) {
            if (arr[leftIndex] != 0) {
                if (arr[rightIndex] != 1) {
                    swap(arr, leftIndex, rightIndex);
                    leftIndex += 1;
                }
            } else {
                leftIndex += 1;
            }
            if (arr[rightIndex] != 1) {
                if (arr[leftIndex] != 0) {
                    swap(arr, leftIndex, rightIndex);
                    rightIndex -= 1;
                }
            } else {
                rightIndex -= 1;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int leftIndex, int rightIndex) {
        int temp = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = temp;
    }
}
