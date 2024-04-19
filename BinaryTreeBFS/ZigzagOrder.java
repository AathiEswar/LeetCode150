package LeetCode150.BinaryTreeBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagOrder {
    public List<List<Integer>> zigZagLevelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 0;
        queue.offer(root);
        while(!queue.isEmpty()){
          List<Integer> order = new ArrayList<>();
          int size = queue.size();

          for(int i=0;i<size;i++){
              TreeNode cur = new TreeNode();
              if(level % 2 == 0){
                  order.add(cur.val);

              }
              else order.add(0 , cur.val);
              if(cur.left != null) queue.offer(cur.left);
              if(cur.right != null) queue.offer(cur.right);
          }
          result.add(order);
          level+=1;
        }
        return result;
    }
}
