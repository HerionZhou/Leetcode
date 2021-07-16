package SwordToOffer;

import java.util.HashMap;

public class SwordToOffer07 {
    // 递归 （根节点索引，左边界索引，右边界索引）
    // 使用Hashmap方便通过节点值取到中序索引
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    int[] preorder;

    public TreeNode algorithm(int[] preorder, int[] inorder){
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length);
    }

    TreeNode recur(int pre_root, int in_left, int in_right){
        if (in_left > in_right) return null;
        TreeNode root = new TreeNode(preorder[pre_root]);
        int idx = map.get(preorder[pre_root]);
        root.left = recur(pre_root + 1, in_left, idx - 1);
        root.right = recur(pre_root + idx - in_left + 1, idx + 1, in_right);
        return root;
    }
}
