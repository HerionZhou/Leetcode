package SwordToOffer;

public class SwordToOffer28 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    public static boolean algorithm(TreeNode root){
        if (root == null) return true;
        return(recur(root.left, root.right));
    }

    public static boolean recur(TreeNode left, TreeNode right){
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return recur(left.left, right.right) && recur(left.right, right.left);
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = null;
        tree.right = new TreeNode(2);
        System.out.println(algorithm(tree));
    }

}
