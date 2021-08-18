package Algorithm.SwordToOffer;

public class SwordToOffer25 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public static ListNode algorithm(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0), temp = head;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
            }else {
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        if (l1 != null){
            temp.next = l1;
        }
        if (l2 != null){
            temp.next = l2;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        System.out.println(algorithm(l1, l2));
    }


}
