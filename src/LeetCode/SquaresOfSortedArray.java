package LeetCode;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        if (nums.length == 1) {
            result[0] = nums[0] * nums[0];
        } else {
            int left = 0;
            int right = nums.length - 1;
            int counter = right;
            while (left <= right) {
                int leftSquare = nums[left] * nums[left];
                int rightSquare = nums[right] * nums[right];
                if (leftSquare <= rightSquare) {
                    result[counter] = rightSquare;
                    right -= 1;
                } else {
                    result[counter] = leftSquare;
                    left += 1;
                }
                counter -= 1;
            }
        }

        return result;
    }
}
