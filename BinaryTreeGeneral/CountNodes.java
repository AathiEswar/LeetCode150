package LeetCode150.BinaryTreeGeneral;

public class CountNodes {
    public int countNodes(TreeNode root) {
        return root == null ? 0 :  countNodes(root.left)+countNodes(root.right)+1;
    }
    public int countNodesOwn(TreeNode root){
        if(root == null){
            return 1;
        }
        int left = countNodesOwn(root.left);
        int right = countNodesOwn(root.right);

        return left + right;
    }

    public int countMain(TreeNode root){
        return countNodesOwn(root) - 1;
    }
}
