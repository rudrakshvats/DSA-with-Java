package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            int level = 0;
            return traverseTree(result, root, level);
        }

        private List<List<Integer>> traverseTree(List<List<Integer>> result, TreeNode root, int level) {
            // break condition
            if (null == root) return result;

            // main condition, if result's size is equal to level it means we are now adding elements on the basis of
            // level, so if the level is equal to result list's size then it means no element for that level is
            // present in result list, so we create an ArrayList first, add root's val in it and then add that list
            // to our result list
            if (result.size() == level) {
                List<Integer> levelList = new ArrayList<>();
                levelList.add(root.val);

                result.add(levelList);
            }
            // if the level is not equal to result list's size it means we already have elements present for that
            // level in result list, so we get the result list's element at index = level, then we add the root.val
            // to that list
            else result.get(level).add(root.val);

            // for left child, we use recursive method by passing root.left in root parameter and add 1 to the level
            // so that we add elements to a new list since we are now traversing for child nodes
            traverseTree(result, root.left, level + 1);

            // for right child, similarly pass root.right as root parameter and add 1 to the level
            traverseTree(result, root.right, level + 1);

            return result;
        }
    }

    // TC: O(n)
    // SC: O(h); where h is height of tree
}
