package SwordToOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SwordToOffer32_1 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    //广度优先遍历，使用队列，java中LinkedList实现了Queue的接口
    //流程：1.根节点入队
    //2.while(队列不空) -> 出队一个节点，若左右子树不空，分别入队
    public static int[] algorithm(TreeNode root){
        if (root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> ans = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            ans.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++){
            res[i] = ans.get(i);
        }
        return res;
    }


}
