package LeetCode150.BinaryTreeBFS;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val,TreeNode left,TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class AverageLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        double levelSum = 0;
        while(!queue.isEmpty()){
            levelSum = 0;
            int size = queue.size();

            for(int i=0;i<size;i++){
                TreeNode cur = queue.poll();
                levelSum += cur.val;

                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
            }

            double levelAvg = levelSum / size;
            result.add(levelAvg);
        }

        return result;

    }
}
