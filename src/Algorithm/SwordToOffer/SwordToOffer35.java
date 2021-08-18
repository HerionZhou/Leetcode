package Algorithm.SwordToOffer;

import java.util.HashMap;
import java.util.Map;

public class SwordToOffer35 {
    public static class Node{
        int val;
        Node next;
        Node random;

        Node(int x){
            this.val = x;
            this.next = null;
            this.random = null;
        }
    }
    //使用map将原节点与新创建的节点对应起来
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node cur = head;
        Map<Node, Node> map = new HashMap<>();
        while (cur != null){
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
