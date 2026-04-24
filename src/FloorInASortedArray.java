import java.util.Arrays;

public class FloorInASortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 0;
        System.out.println(findFloor(arr, x));
    }

    public static int findFloor(int[] arr, int x) {
        // code here
        // a sequential search approach
//        if (arr.length == 0) return -1;
//        if (arr.length == 1) {
//            if (arr[0] <= x) return 0;
//            else return -1;
//        }
//        int leftPointer = 0;
//        int rightPointer = arr.length - 1;
//        if (arr[rightPointer] == x) return rightPointer;
//        if (arr[leftPointer] > x) return -1;
//        if (arr[rightPointer] < x) return rightPointer;
//        while (arr[leftPointer] <= x) {
//            if (arr[leftPointer] <= x) leftPointer += 1;
//        }
//        if (arr[leftPointer] > x) {
//            return leftPointer -= 1;
//        }
//
//        return leftPointer;

        // TC -> O(n)
        // SC -> O(1)

        // binary search approach

        // take a left pointer equal to lowest index
        int left = 0;
        // take a right pointer equal to right index
        int right = arr.length - 1;

        // initialize result variable to -1 just in case for those floor values of x which are not present in array
        int result = -1;

        // run a loop until left is less than equal to right
        while (left <= right) {
            // find mid which is sum of left and right divide by 2
            int mid = (left + right) / 2;
            // if the element at mid is less than equal to x, then we assign mid value to result because the value will now be checked on the right side of the array,
            // and we will change left value according to lowest value of right array which is mid + 1 just like we do in binary search
            if (arr[mid] <= x) {
                result = mid;
                left = mid + 1;
            }
            // else just assign right value to mid - 1 and again run through the loop
            else {
                right = mid - 1;
            }
        }

        return result;
    }
}
