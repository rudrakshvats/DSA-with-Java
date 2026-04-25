package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            System.out.println(Arrays.toString(nums1));
            return;
        }
        // in this kind of problems, we always start from back of the arrays because we are already given empty spaces as in 0 values in nums1 array to make the
        // better of use empty spaces without disrupting elements from front
        // here we will use two pointer approach, where this time we will also take one extra pointer which is a third pointer which will traverse though nums1
        // array to populate the values in a sorted manner as well
        // take the first pointer as num1Pointer which will go from m - 1 to 0, so equate it to m - 1 value
        int nums1Pointer = m - 1;
        // take the second pointer as nums1Pointer which will go from n - 1 to 0, so equate it to n - 1 value
        int nums2Pointer = n - 1;
        // take the third pointer as a pointer which actually goes from m + n - 1 to 0, so equate it to m + n - 1 value
        int placePointer = m + n - 1;
        // run a loop such for condition until nums2Pointer is greater than equal to 0
        while (nums2Pointer >= 0) {
            // for the condition where element in nums1 at nums1Pointer is greater than element in nums2 at nums2Pointer, then we simply put the nums1Pointer
            // element at placePointer in nums1
            if (nums1Pointer >= 0 && nums1[nums1Pointer] > nums2[nums2Pointer]) {
                nums1[placePointer] = nums1[nums1Pointer];
                nums1Pointer -= 1;
            }
            // else, we will put nums2Pointer element in nums2 in nums1 at placePointer index
            else {
                nums1[placePointer] = nums2[nums2Pointer];
                nums2Pointer -= 1;
            }
            // and then we will move one step back from back towards front of nums1 array
            placePointer -= 1;
        }

        System.out.println(Arrays.toString(nums1));
    }
}
