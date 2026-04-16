public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int low = 0;
        int high = arr.length - 1;
        int target = 23;
        System.out.print(binarySearchUsingRecursion(arr, low, high, target));
    }

    private static int binarySearchUsingRecursion(int[] arr, int low, int high, int target) {
        if (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) return mid;

            if (arr[mid] < target) return binarySearchUsingRecursion(arr, mid + 1, high, target);
            else return binarySearchUsingRecursion(arr, 0, mid - 1, target);
        }

        return -1;
    }

    // TC --> O(N)
    // SC --> O(1)
}

