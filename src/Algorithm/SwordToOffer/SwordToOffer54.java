package Algorithm.SwordToOffer;

import java.util.ArrayList;

public class SwordToOffer54 {

    static class Solution{
        public class TreeNode{
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x){
                this.val = x;
                this.left = null;
                this.right = null;
            }
        }
        //
        ArrayList<TreeNode> list = new ArrayList<>();
        public int algorithm(TreeNode root, int k){
            recur(root);

            return list.get(k - 1).val;

        }
        public void recur(TreeNode root){
            if (root == null) return;

            recur(root.right);
            list.add(root);
            recur(root.left);
        }

        //找到第k大的结点，取值即可；找到后提前结束
        int res, k;
        public int algorithm1(TreeNode root, int k){
            this.k = k;
            recur1(root);
            return res;
        }
        public void recur1(TreeNode root){
            if (root == null) return;
            recur1(root.right);
            if (k == 0) return;
            k--;
            if (k == 0) res = root.val;
            recur1(root.left);
        }

    }

}
