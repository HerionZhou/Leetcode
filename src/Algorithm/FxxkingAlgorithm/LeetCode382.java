package Algorithm.FxxkingAlgorithm;

import java.util.Random;

public class LeetCode382 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //从链表中随机选择数
    public static class Solution {
        Random random;
        ListNode head;
        /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
        public Solution(ListNode head) {
            this.head = head;
            this.random = new Random();
        }

        /** Returns a random node's value. */
        public int getRandom() {
            int res = 0;
            int i = 1;
            ListNode cur = head;
            while (cur != null){
                if (random.nextInt(i) == 0){
                    res = cur.val;
                }
                i++;
                cur = cur.next;
            }
            return res;
        }

        //随机选择k个数
        public int[] getRandom1(int k) {
            int[] res = new int[k];
            ListNode cur = head;
            for (int i = 0; i < k; i++) {
                res[i] = cur.val;
                cur = cur.next;
            }
            int count = k;
            while (cur != null) {
                int temp = random.nextInt(count);
                if (temp < k) {
                    res[temp] = cur.val;
                }
                cur = cur.next;
            }
            return res;
        }
    }

}
