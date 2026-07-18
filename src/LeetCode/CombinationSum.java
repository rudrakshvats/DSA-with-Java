package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> current = new ArrayList<>();
        dfsBacktracking(0, candidates, target, current, result);

        return result;
    }

    private static void dfsBacktracking(int startIndex, int[] candidates, int remainingTarget, List<Integer> current, List<List<Integer>> result) {
        if (remainingTarget == 0) {
            result.add(new ArrayList<>(current));
            return;
        } else if (remainingTarget > 0) {
            for (int i = startIndex; i < candidates.length; i++) {
                current.add(candidates[i]);
                int newRemaining = remainingTarget - candidates[i];
                dfsBacktracking(i, candidates, newRemaining, current, result);
                current.remove(current.size() - 1);
            }
        } else return;
    }
}
