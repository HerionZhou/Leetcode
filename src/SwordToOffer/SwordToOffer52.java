package SwordToOffer;

import java.util.HashSet;
import java.util.Set;

public class SwordToOffer52 {
    static class Solution{
        public class ListNode{
            int val;
            ListNode next;
            ListNode(int x){
                this.val = x;
                this.next = null;
            }
        }
        //集合
        public ListNode algorithm(ListNode headA, ListNode headB){
            Set<ListNode> set = new HashSet<>();
            while (headA != null){
                set.add(headA);
                headA = headA.next;
            }
            while (headB != null){
                if (set.contains(headB)) return headB;
                headB = headB.next;
            }
            return null;
        }
        //差值法
        public ListNode algorithm1(ListNode headA, ListNode headB){
            int lenA = 0, lenB = 0;
            ListNode tempA = headA, tempB = headB;
            while (tempA != null) {
                lenA++;
                tempA = tempA.next;
            }
            while (tempB != null) {
                lenB++;
                tempB = tempB.next;
            }
            int d = lenA - lenB;
            if (d > 0){
                while (d > 0){
                    headA = headA.next;
                    d--;
                }
            }else if (d < 0){
                while (d < 0){
                    headB = headB.next;
                    d++;
                }
            }
            while (headA != headB){
                headA = headA.next;
                headB = headB.next;
            }
            return headA;
        }
        //等值法
        public ListNode algorithm2(ListNode headA, ListNode headB){
            ListNode tempA = headA, tempB = headB;
            while (tempA != tempB){
                if (tempA != null) tempA = tempA.next;
                else tempA = headB;
                if (tempB != null) tempB = tempB.next;
                else tempB = headA;
            }
            return tempA;
        }
    }

}
