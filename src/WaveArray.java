import java.util.Arrays;

public class WaveArray {

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 8, 9, 10};
        sortInWave(arr);
    }

    public static void sortInWave(int arr[]) {
        // code here
        int counter = 0;
        while (counter + 1 < arr.length) {
            // for first element
            swap(arr, counter, counter + 1);
            counter += 2;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
