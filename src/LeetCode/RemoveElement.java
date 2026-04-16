package LeetCode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int val = 5;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) {
            if (nums[0] == val) return 0;
            else return 1;
        }
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        boolean contains = Arrays.stream(nums).anyMatch(x -> x == val);

        while (leftPointer < rightPointer) {
            if (nums[leftPointer] == val) {
                if (nums[rightPointer] == val) {
                    rightPointer -= 1;
                } else {
                    int temp = nums[leftPointer];
                    nums[leftPointer] = nums[rightPointer];
                    nums[rightPointer] = temp;
                    leftPointer += 1;
                }
            } else {
                leftPointer += 1;
            }
        }

        return contains ? leftPointer : leftPointer + 1;
    }
}
