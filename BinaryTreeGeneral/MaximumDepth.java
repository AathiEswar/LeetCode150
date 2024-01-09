package LeetCode150.BinaryTreeGeneral;

class TreeNode {
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

public class MaximumDepth {
    int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int rlen = height(root.right);
            int llen = height(root.left);

            if (rlen > llen) return (rlen + 1);
            else return (llen + 1);
        }
    }

    public int maxDepth(TreeNode root) {
        return height(root);
    }
}
