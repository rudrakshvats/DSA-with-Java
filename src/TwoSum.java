public class TwoSum {

    // in this problem we are given an integer array and a target value
    // our job is to check the whole array and return true if the array has a pair of two integers whose sum is equal to target
    // if not, then simply return false if there are no pairs
    public static void main(String[] args) {
        int[] arr = {-3, -1, 0, 1, 2};
        int target = -2;
        System.out.println(twoSum(arr, target));
    }

    // we will use two pointer method which is linear time complex
    // for using two pointer methods, we make sure the array is sorted in ascending or descending order
    public static boolean twoSum(int[] arr, int target) {
        int leftPointer = 0;
        int rightPointer = arr.length - 1;

        while (leftPointer < rightPointer) {
            int sum = arr[leftPointer] + arr[rightPointer];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                leftPointer += 1;
            } else {
                rightPointer -= 1;
            }
        }

        return false;
    }

    // TC -> O(n)
    // SC -> O(1)
}
