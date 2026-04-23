package LeetCode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        int target = 1;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        // if the nums array is empty then simply return 0
        if (nums.length == 0) return 0;
        // if the nums array is of length 1
        if (nums.length == 1) {
            // check if the only element is equal to target or not, if yes then 0 is the answer as the target is the only element in the array
            if (nums[0] == target) return 0;
            // else if the target is greater than only element in the array, then obviously it will be present at 1
            else if (nums[0] < target) return 1;
            // else just return 0
            else return 0;
        }
        // we will use two pointer approach in this problem
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        // check if target is less than the first element of the array or not, if yes then return 0
        if (target < nums[leftPointer]) return leftPointer;
        // else just return the length of nums array, because it will always be greater than last element's index value
        if (target > nums[rightPointer]) return nums.length;
        // we will use two pointer here and loop the condition if the target is less than element at leftPointer and greater than equal to element at
        // rightPointer, greater than equal to because the target can be equal to the last element as well, and we are not doing the same for leftPointer because
        // we are returning leftPointer as the final answer
        while (target > nums[leftPointer] && target <= nums[rightPointer]) {
            if (target > nums[leftPointer]) {
                leftPointer += 1;
            } else if (target < nums[rightPointer]) {
                rightPointer -= 1;
            }
        }

        return leftPointer;
    }
}
