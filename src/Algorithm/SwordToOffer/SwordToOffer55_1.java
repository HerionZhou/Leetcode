package Algorithm.SwordToOffer;

public class SwordToOffer55_1 {
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
        int res;
        public int algorithm(TreeNode root){
            recur(root, 1);
            return res;
        }
        public void recur(TreeNode root, int layer){
            if (root == null) return;
            res = Math.max(res, layer);
            recur(root.left, layer + 1);
            recur(root.right, layer + 1);
        }
        //精简
        public int algorithm1(TreeNode root){
            if (root == null) return 0;
            return Math.max(algorithm1(root.left), algorithm1(root.right)) + 1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
    }


}
