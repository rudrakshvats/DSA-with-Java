package LeetCode;


import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        int target = 6;

        int[] resultArr = new int[2];

        // brute force
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i != j && nums[i] + nums[j] == target) {
//                    resultArr[0] = i;
//                    resultArr[1] = j;
//                    break;
//                }
//            }
//            if (resultArr[0] != 0 && resultArr[1] != 0) {
//                break;
//            }
//        }

        // TC -> O(n^2)
        // SC -> O(n)

        // optimal
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                resultArr[0] = map.get(complement);
                resultArr[1] = i;
            }
            map.put(nums[i], i);
        }

        // TC -> O(n)
        // SC -> O(n)

        System.out.print(Arrays.toString(resultArr));
    }
}
