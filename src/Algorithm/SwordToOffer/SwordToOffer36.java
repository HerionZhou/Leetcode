package Algorithm.SwordToOffer;

public class SwordToOffer36 {
    static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    static class Solution{
        public Node algorithm(Node root){
            if (root == null) return null;
            recur(root);
            Node first = root;
            Node last = root;
            while(first.left != null) first = first.left;
            while(last.right != null) last = last.right;
            first.left = last;
            last.right = first;
            return first;
        }

        public void recur(Node root){
            if (root == null || root.left == null || root.right == null) return;
            Node left;
            Node right;
            if (root.left != null){
                left = root.left;
            }else {
                left = root;
            }
            if (root.right != null){
                right = root.right;
            }else {
                right = root;
            }
            while (left != null && left.right != null){
                left = left.right;
            }
            while (right != null && right.left != null){
                right = right.left;
            }
            recur(root.left);
            recur(root.right);
            left.right = root;
            right.left = root;
            root.left = left;
            root.right = right;
        }

    }
    //二叉搜索树中序遍历结果按从小到大排列
    static class Solution1{
        Node pre, head;
        public Node algorithm(Node root){
            if (root == null) return null;
            recur(root);
            head.left = pre;
            pre.right = head;
            return head;
        }

        public void recur(Node root){
            if (root == null) return;
            recur(root.left);
            if (pre == null) head = root;
            else pre.right = root;
            root.left = pre;
            pre = root;
            recur(root.right);
        }

    }

    public static void main(String[] args){
        Node root = new Node(4);
        root.left = new Node(2);
//        root.right = new Node(5);
//        root.left.left = new Node(1);
//        root.left.right = new Node(3);
        Solution1 s = new Solution1();
        s.algorithm(root);
    }
}
