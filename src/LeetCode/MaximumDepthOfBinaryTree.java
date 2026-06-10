package LeetCode;

import javax.swing.tree.TreeNode;

public class MaximumDepthOfBinaryTree {

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
        public int maxDepth(TreeNode root) {
            // simply return 0 if root is null
            if (null == root) return 0;

            // call recursive function on root node
            return maxDepthForBinaryTree(root);
        }

        // this recursive function first checks if the root is null or not, and that's the break condition
        // if not then calculate for left node and right node separately, and simply compare them using Math.max() to get maximum depth
        // add 1 to max depth because root carried 1 unit in depth, even if there are no children, depth will be at least 1
        private int maxDepthForBinaryTree(TreeNode root) {
            if (null == root) return 0;

            int left = maxDepthForBinaryTree(root.left);
            int right = maxDepthForBinaryTree(root.right);

            return 1 + Math.max(left, right);
        }
    }
}
