package Algorithm.SwordToOffer;

import java.util.LinkedList;
import java.util.List;

public class SwordToOffer34 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val = x;
        }
        TreeNode(int x, TreeNode left, TreeNode right){
            this.val = x;
            this.left = left;
            this.right = right;
        }
    }

    public static LinkedList<List<Integer>> res = new LinkedList<>();
    public static LinkedList<Integer> itemList = new LinkedList<>();

    public static List<List<Integer>> algorithm(TreeNode root, int target){
        recur(root, target);
        return res;
    }

    public static void recur(TreeNode root, int target){
        if (root == null) return;
        itemList.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null){
            res.add(new LinkedList(itemList));
        }
        recur(root.left, target);
        recur(root.right, target);
        itemList.removeLast();
    }

    public static void main (String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        System.out.println(algorithm(root, 22));
    }

}
