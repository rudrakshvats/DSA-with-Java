package LeetCode;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = {2, 1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        if (nums.length > 1) {
            int left = 0;
            int right = 1;

            while (left < nums.length - 1 && right < nums.length && left < right) {
                if (nums[left] == 0) {
                    if (nums[right] != 0) {
                        swap(nums, left, right);
                        left += 1;
                    }
                } else {
                    left += 1;
                }
                right += 1;
            }
        }
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
