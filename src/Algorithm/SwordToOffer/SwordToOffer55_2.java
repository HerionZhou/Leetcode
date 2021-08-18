package Algorithm.SwordToOffer;

public class SwordToOffer55_2 {
    static class Solution{
        public class TreeNode{
            int val;
            TreeNode left;
            TreeNode right;

            TreeNode(int x) {
                this.val = x;
                this.left = null;
                this.right = null;
            }
        }
        public boolean algorithm(TreeNode root){
            return recur(root) != -1;
        }
        public int recur(TreeNode root){
            if (root == null) return 0;
            int left = recur(root.left);
            if (left == -1) return -1;
            int right = recur(root.right);
            if (right == -1) return -1;
            return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
        }
    }

}
