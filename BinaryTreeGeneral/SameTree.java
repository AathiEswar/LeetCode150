package LeetCode150.BinaryTreeGeneral;

public class SameTree {
    public static boolean bol;

    public void inOrder(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 != null || root2 == null && root1 != null) {
            bol = false;
        }
        if (root1 == null || root2 == null) return;
        inOrder(root1.left, root2.left);


        if (root1.val != root2.val) bol = false;

        inOrder(root1.right, root2.right);

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        bol = true;
        inOrder(p, q);
        return bol;
    }
}
