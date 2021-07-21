package SwordToOffer;

public class SwordToOffer24 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public static ListNode algorithm(ListNode head){
        if (head == null) return null;
        ListNode temp, former;
        former = head.next;
        temp = head;
        head.next = null;
        while (former != null){
            temp = former;
            former = former.next;
            temp.next = head;
            head = temp;
        }
        return head;
    }
}
