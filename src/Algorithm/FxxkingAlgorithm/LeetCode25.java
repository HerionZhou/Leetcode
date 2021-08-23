package Algorithm.FxxkingAlgorithm;

public class LeetCode25 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution{
        //k个一组反转链表
        public ListNode algorithm(ListNode head, int k){
            if (head == null) return null;
            ListNode a, b;
            a = head;
            b = head;
            for (int i = 0; i < k; i++){
                if (b == null) return head;
                b = b.next;
            }
            ListNode newHead = recur(a, b);
            a.next = algorithm(b, k);
            return newHead;
        }

        public ListNode recur(ListNode a, ListNode b){
            ListNode pre, cur, next;
            pre = null;
            cur = a;
            while (cur != b){
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return pre;

        }

    }
}
