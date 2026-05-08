package LeetCode;

import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70,80,90};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closestSum = 0;
        int minimumDifference = 0;

        for (int i = 0; i < nums.length; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int difference;

                if (sum > target) {
                    difference = sum - target;
                    right -= 1;
                } else if (sum < target) {
                    difference = target - sum;
                    left += 1;
                } else {
                    return sum;
                }

                if (minimumDifference == 0) minimumDifference = difference;

                if (difference <= minimumDifference) {
                    closestSum = sum;
                    minimumDifference = difference;
                }
            }
        }

        return closestSum;
    }
}
