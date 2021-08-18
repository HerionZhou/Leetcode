package Algorithm.Recursion;

public class LeetCode112 {
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}

         TreeNode(int val) { this.val = val; }

         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }

    static class Solution{
        //路径总和
        //递归
        public boolean algorithm(TreeNode root, int targetSum){
            if (root == null) return false;
            int temp = targetSum - root.val;
            if (temp == 0 && root.left == null && root.right == null) return true;
            else {
                return algorithm(root.left, temp) || algorithm(root.right, temp);
            }
        }

    }
}
