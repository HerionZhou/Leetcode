package Algorithm.SwordToOffer;

public class SwordToOffer33 {
    public static boolean algorithm(int[] postorder){
        return recur(postorder, 0, postorder.length - 1);
    }
    //递归，当前根节点与左右子树符合二叉搜索树 && 左子树符合 && 右子树符合
    public static boolean recur(int[] postorder, int i, int j){
        if (i >= j) return true;
        int root = postorder[j];
        int p = i;
        //第一个比根节点大的开始，后面都应属于右子树
        while (postorder[p] < root) p++;
        int center = p;
        while (postorder[p] > root) p++;
        //p == j：说明左子树都小于根节点，右子树都大于根节点
        return p == j && recur(postorder, i, center -1) && recur(postorder, center, j - 1);
    }


}
