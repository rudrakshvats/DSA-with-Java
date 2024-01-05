package InterviewQuestions;

/**
 * Given the array of integers nums, you will choose two different indices i and j
 * of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 */
public class LeetCode1464 {
    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 2};
        int[] nums2 = {1, 5, 4, 5};
        int[] nums3 = {3, 7};
        System.out.println("The max product is: " + maxProduct(nums1));
        System.out.println("The max product is: " + maxProduct(nums2));
        System.out.println("The max product is: " + maxProduct(nums3));
    }

    public static int maxProduct(int[] nums) {
        int i = 0;
        int j = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] > nums[i]) {
                i = k;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            if (k != i && nums[k] > nums[j]) {
                j = k;
            }
        }

        return (nums[i] - 1) * (nums[j] - 1);
    }
}
