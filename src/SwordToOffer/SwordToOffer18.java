package SwordToOffer;

public class SwordToOffer18 {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public static ListNode algorithm(ListNode head, int val){
        if (head.val == val) return head.next;
        ListNode perNode = head;
        ListNode nowNode = head.next;
        while (nowNode != null){
            if (nowNode.val == val){
                perNode.next = nowNode.next;
                break;
            }else {
                perNode = nowNode;
                nowNode = nowNode.next;
            }
        }
        return head;
    }

}
