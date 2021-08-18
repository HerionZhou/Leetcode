package Algorithm.SwordToOffer;

public class SwordToOffer26 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    //A、B有一个为空，返回false；A为根节点的子树包含B 或 A的左子树包含B 或 A的右子树包含B。
    public static boolean algorithm(TreeNode A, TreeNode B){
        return  (A != null && B != null) && (dfs(A, B) || algorithm(A.left, B) || algorithm(A.right, B));
    }
    //B为空，返回false；B不空，A为空则越界，返回false；当前两节点值不同，返回false；递归判断左子树、右子树。
    public static boolean dfs(TreeNode A, TreeNode B){
        if (B == null) return true;
        if (A == null || A.val != B.val) return false;
        return dfs(A.left, B.left) && dfs(A.right, B.right);
    }

}
