public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int low = 0;
        int high = arr.length - 1;
        int target = 23;
        System.out.println(binarySearchUsingRecursion(arr, low, high, target));
    }

    private static int binarySearchUsingRecursion(int[] arr, int low, int high, int target) {
        if (low < high) {
            int mid = (low + high) / 2;

            // if we found the target at the mid index value, then simply return mid value, which is actually the break condition for recursive function
            if (arr[mid] == target) return mid;

            // if target is greater than element at mid index then simply, assign the low value to mid + 1 value and keep the high same
            if (arr[mid] < target) return binarySearchUsingRecursion(arr, mid + 1, high, target);
            // else if target is less than element at mid index then low becomes 0 and high becomes mid - 1
            else return binarySearchUsingRecursion(arr, 0, mid - 1, target);
        }

        return -1;
    }

    // TC --> O(N)
    // SC --> O(1)
}

