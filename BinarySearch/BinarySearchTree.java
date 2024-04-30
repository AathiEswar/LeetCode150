package LeetCode150.BinarySearch;
   

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
}

public class BinarySearchTree {
    TreeNode prev = null;
    int min = Integer.MAX_VALUE;

    public void inOrder(TreeNode root){
        if(root == null)return;

        inOrder(root.left);

        if(prev!=null){
            min = Math.min(min, root.val - prev.val);
        }
        prev = root;

        inOrder(root.right);
    }

    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return min;
    }
}
