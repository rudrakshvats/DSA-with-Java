package LeetCode;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        // take a pointer which will be used for shrinkage
        int left = 0;
        // take a pointer which will be used for increading sum
        int right = left;
        // take a windowSum variable and initialise it with 0
        int windowSum = 0;

        // take MAX_VALUE of integer so that internally we can use Math.min function to get minimum length value
        int minimumLength = Integer.MAX_VALUE;

        // run a loop until we reach the front of array
        while (right < nums.length) {
            // add the value at right in windowSum
            windowSum += nums[right];

            // we will check if windowSum is greater than equal to target, we will run a loop, store the minimum length
            // value and then start shrinking
            while (windowSum >= target) {
                minimumLength = Math.min(minimumLength, right - left + 1);
                windowSum -= nums[left++];
            }

            // in the end we will increment right value by 1
            right += 1;
        }

        // suppose if all elements in array still don't add up to minimumLength, then we will return 0 else, minimumLength
        return minimumLength == Integer.MAX_VALUE ? 0 : minimumLength;
    }
}
