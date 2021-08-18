package Algorithm.SwordToOffer;

public class SwordToOffer27 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    public static TreeNode algorithm(TreeNode root){
        recur(root);
        return root;
    }

    public static void recur(TreeNode root){
        if (root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        recur(root.left);
        recur(root.right);
    }

}
