package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        boolean[] usedArray = new boolean[nums.length];

        List<Integer> current = new ArrayList<>();

        permutationBacktracking(usedArray, nums, current, result);

        return result;
    }

    private static void permutationBacktracking(boolean[] usedArray, int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (usedArray[i]) {
                continue;
            }

            current.add(nums[i]);
            usedArray[i] = true;

            permutationBacktracking(usedArray, nums, current, result);

            current.remove(current.size() - 1);
            usedArray[i] = false;
        }
    }
}
