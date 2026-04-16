package LeetCode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5};
        int target = 4;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) {
            if (nums[0] == target) return 0;
            else if (nums[0] < target) return 1;
            else return 0;
        }
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        while (leftPointer < rightPointer) {
            if (nums[leftPointer] > target) {
                return leftPointer;
            } else if (nums[leftPointer] < target) {
                leftPointer += 1;
            }
            if (nums[rightPointer] < target) {
                return nums.length;
            } else if (nums[rightPointer] > target) {
                rightPointer -= 1;
            }
        }

        return leftPointer;
    }
}
