package SwordToOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SwordToOffer32_3 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x){
            val = x;
        }
    }
    //使用双向链表存树节点
    public static List<List<Integer>> algorithm(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        LinkedList<TreeNode> nodeList = new LinkedList<>();
        boolean flag = false;
        nodeList.add(root);
        while (!nodeList.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = nodeList.size(); i > 0; i--){
                if (flag){
                    TreeNode node = nodeList.removeLast();
                    temp.add(node.val);
                    if (node.right != null) nodeList.addFirst(node.right);
                    if (node.left != null) nodeList.addFirst(node.left);
                }else {
                    TreeNode node = nodeList.removeFirst();
                    temp.add(node.val);
                    if (node.left != null) nodeList.add(node.left);
                    if (node.right != null) nodeList.add(node.right);
                }
            }
            res.add(temp);
            if (flag) flag = false;
            else flag = true;
        }
        return res;
    }
    //使用双向链表存数值
    public static List<List<Integer>> algorithm1(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        boolean flag = false;
        queue.add(root);
        while (!queue.isEmpty()){
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i = queue.size(); i > 0; i--){
                TreeNode node = queue.poll();
                if (flag) temp.addFirst(node.val);
                else temp.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(temp);
            if (flag) flag = false;
            else flag = true;
        }
        return res;
    }

}
