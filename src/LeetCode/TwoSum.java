package LeetCode;


import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        int target = 6;

        int[] resultArr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    resultArr[0] = i;
                    resultArr[1] = j;
                    break;
                }
            }
            if (resultArr[0] != 0 && resultArr[1] != 0) {
                break;
            }
        }

        System.out.print(Arrays.toString(resultArr));
    }
}
