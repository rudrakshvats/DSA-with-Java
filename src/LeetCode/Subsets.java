package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        // for result
        List<List<Integer>> result = new ArrayList<>();
        // for current ArrayList
        List<Integer> current = new ArrayList<>();
        // recursive call
        dfsBacktracking(0, nums, current, result);
        // return result
        return result;
    }

    private static void dfsBacktracking(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // base case
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            System.out.println("Index Value = " + index + ", Current Value = " + current + ", Result Value = " + result);
            return;
        }

        // include/add index element everytime in current and then call recursive function with index + 1 value
        System.out.println("Index Value Before Add = " + index);
        current.add(nums[index]);
        System.out.println("Current Value = " + current);
        dfsBacktracking(index + 1, nums, current, result);

        // exclude/remove index element everytime from current and then call recursive function with index + 1 value
        System.out.println("Index Value Before Remove = " + index);
        current.remove(current.size() - 1);
        System.out.println("Current Value = " + current);
        dfsBacktracking(index + 1, nums, current, result);
    }

    // TC: O(n * 2^n)
    // SC: O(n * 2^n)
}
