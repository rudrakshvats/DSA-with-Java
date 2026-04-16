package LeetCode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(arr));
    }

    // we will use two pointer approach in this one, as we have a sorted array already
    // we will traverse through the array, take two pointers 0 as left pointer and 1 as right pointer
    // traverse right pointer from 1 to nums.length - 1
    // if element at left pointer is less than right pointer then simply increment left pointer by 1 and assign element at left pointer to element at right pointer
    // else just increment right pointer by 1
    // in the end just return the left pointer + 1 value because the element at left pointer will always be 1 less than size of non-duplicate sorted array
    // i.e. for above example the result array will look like [0, 1, 2, 3, 4, _, _, _, _], so if we just return left pointer then compiler will understand final array
    // as [0, 1, 2, 3] which is of size equal to left pointer so return increment value to 1
    public static int removeDuplicates(int[] nums) {
        int leftPointer = 0;
        int rightPointer = 1;
        while (leftPointer < rightPointer && rightPointer < nums.length) {
            if (nums[leftPointer] < nums[rightPointer]) {
                leftPointer += 1;
                nums[leftPointer] = nums[rightPointer];
            }
            rightPointer += 1;
        }

        System.out.println(Arrays.toString(nums));
        return leftPointer + 1;
    }
}
