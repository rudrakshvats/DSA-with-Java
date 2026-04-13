import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
    }

    public static void reverseArray(int arr[]) {
        // code here
        int temp;
        int j = 0;
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j += 1;
        }

        System.out.println(Arrays.toString(arr));
    }
}
