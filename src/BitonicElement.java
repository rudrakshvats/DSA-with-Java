public class BitonicElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        System.out.println(findMaximum(arr));
    }

    public static int findMaximum(int[] arr) {
        // code here
        int low = 0;
        int high = arr.length - 1;

        int result = 0;

        while (low < high) {
            int mid  = (low + high) / 2;

            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return arr[low];
    }
}
