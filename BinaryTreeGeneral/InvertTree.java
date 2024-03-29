package LeetCode150.BinaryTreeGeneral;

public class InvertTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */


        public TreeNode invertTree(TreeNode root) {
            if(root == null)return null;
            TreeNode dummy = root.left;
            root.left = root.right;
            root.right = dummy;
            invertTree(root.left);
            invertTree(root.right);
            return root;

        }

}
