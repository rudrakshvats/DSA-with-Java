package LeetCode;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        int[] nums = {2,0,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    // we will use Dutch National Flag Algorithm, where we will divide array into 4 parts
    // first part from index 0 to low - 1 (all 0's)
    // second part from low to mid - 1 (all 1's)
    // third part from mid to high (unprocessed elements)
    // fourth part from high + 1 to n - 1 (all 2's)
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        // we will run loop until mid is less than equal to high, when it is greater than high, we will break the loop
        while (mid <= high) {
            // if element at mid is equal to 0, then simply swap element at low with mid, increment low and mid by 1
            if (nums[mid] == 0) {
                swap(nums, low++, mid++);
            }
            // if element at mid is equal to 1, then simply increment mid by 1
            else if (nums[mid] == 1) mid += 1;
            // else if element at mid is equal to 2, then swap element at mid with high, decrement high by 1
            else {
                swap(nums, mid, high--);
            }
        }
    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
