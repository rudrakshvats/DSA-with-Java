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
            // call the recursive method call on both root nodes
            return sameTreeTraversal(p, q);
        }

        private boolean sameTreeTraversal(TreeNode p, TreeNode q) {
            // if both p AND q are null simply return true, because they are identical
            if (p == null && q == null) return true;

            // if one of the root is null then return false, because if we proceed further we will get NPE
            if (p == null || q == null) return false;

            // compare values of both nodes because they will be different object but will have same value
            if (p.val != q.val) return false;

            // call recursive call on both left nodes AND recursive call on both right nodes to check if trees are identical
            return sameTreeTraversal(p.left, q.left) && sameTreeTraversal(p.right, q.right);
        }
    }
}
