package SwordToOffer;

import java.util.LinkedList;
import java.util.Queue;

public class SwordToOffer37 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x){
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }

    public static class Codec{
        //拼接字符串用StringBuilder
        //StringBuilder
        //删除指定元素deleteCharAt(index)
        //添加元素append("str")
        public String serialize(TreeNode root){
            if (root == null) return "[]";
            StringBuilder charList = new StringBuilder();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            charList.append("[");
            while (!queue.isEmpty()){
                TreeNode node = queue.poll();
                if (node != null) {
                    charList.append(node.val + ",");
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
                else charList.append("null" + ",");
            }
            charList.deleteCharAt(charList.length() - 1);
            charList.append("]");
            return charList.toString();
        }

        public TreeNode deserialize(String data){
            if (data.equals("[]")) return null;
            String[] val = data.substring(1, data.length() - 1).split(",");
            Queue<TreeNode> queue = new LinkedList<>();
            TreeNode root = new TreeNode(Integer.parseInt(val[0]));
            queue.offer(root);
            int i = 1;
            while (!queue.isEmpty()){
                TreeNode node = queue.poll();
                if(!val[i].equals("null")){
                    node.left = new TreeNode(Integer.parseInt(val[i]));
                    queue.offer(node.left);
                }
                i++;
                if(!val[i].equals("null")){
                    node.right = new TreeNode(Integer.parseInt(val[i]));
                    queue.offer(node.right);
                }
                i++;
            }
            return root;
        }

    }

}
