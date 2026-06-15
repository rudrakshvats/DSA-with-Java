package LeetCode;

public class SameTree {

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
        public boolean isSameTree(TreeNode p, TreeNode q) {
            // using recursive function on both root nodes of Trees
            return checkIfSameTree(p, q);
        }

        private boolean checkIfSameTree(TreeNode p, TreeNode q) {
            // check if both nodes are NULL using AND clause
            if (null == p && null == q) return true;

            // check if one of the node is NULL or not to prevent NPE in next step
            if (null == p || null == q) return false;

            // compare values of both nodes
            if (p.val != q.val) return false;

            // using AND clause, we call recursive function on both LEFT subtree and RIGHT subtree
            return checkIfSameTree(p.left, q.left) && checkIfSameTree(p.right, q.right);
        }
    }
}
