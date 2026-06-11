package LeetCode;

public class InvertBinaryTree {

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
        public TreeNode invertTree(TreeNode root) {
            // if root is null then simply return null
            if (null == root) return null;
            // call recursive traversal function on root node
            return traverseTree(root);
        }

        private TreeNode traverseTree(TreeNode root) {
            // break condition, if root is null then break recursive function
            if (null == root) return null;

            // swapping left and right tree node
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            // call recursive function on left subtree and right subtree
            traverseTree(root.left);
            traverseTree(root.right);

            // return root
            return root;
        }
    }
}
