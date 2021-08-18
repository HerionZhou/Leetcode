package Algorithm.SwordToOffer;

import java.util.*;

public class SwordToOffer68_1 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x){
            val = x;
        }
    }
    static class Solution{
        Map<TreeNode, TreeNode> father = new HashMap<>();
        public TreeNode algorithm(TreeNode root, TreeNode p, TreeNode q){
            recur(null, root);
            Set<TreeNode> set = new HashSet<>();
            TreeNode fa = p;
            while (fa != null){
                set.add(fa);
                fa = father.get(fa);
            }
            fa = q;
            while (fa != null){
                if (set.contains(fa)){
                    return fa;
                }
                fa = father.get(fa);
            }
            return root;
        }

        public void recur(TreeNode fa, TreeNode cur){
            father.put(cur, fa);
            if (cur.left != null){
                recur(cur, cur.left);
            }
            if (cur.right != null){
                recur(cur, cur.right);
            }

        }

        public TreeNode algorithm1(TreeNode root, TreeNode p, TreeNode q){
            if (root == null || root == p || root == q) return root;
            TreeNode left = algorithm1(root.left, p, q);
            TreeNode right = algorithm1(root.right, p, q);
            if (left == null) return right;
            if (right == null) return left;
            return root;
        }

        //二叉搜索树
        public TreeNode algorithm2(TreeNode root, TreeNode p, TreeNode q){
            while (root != null){
                if (p.val < root.val && q.val < root.val) root = root.left;
                else if (p.val > root.val && q.val > root.val) root = root.right;
                else return root;
            }
            return root;
        }

    }
}
