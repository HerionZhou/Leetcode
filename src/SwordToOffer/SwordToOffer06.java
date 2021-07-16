package SwordToOffer;

import java.util.ArrayList;

public class SwordToOffer06 {
    // 递归：递归出口为head=null，回溯时将值加入列表（ArrayList）
    // 此为方法一，方法二见SwordToOffer06_1
    public  class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }

    static ArrayList<Integer> temp = new ArrayList<Integer>();

    public static int[] algorithm(ListNode head){

        recur(head);
        int[] res = new int[temp.size()];
        for (int i = 0; i < res.length; i++){
            res[i] = temp.get(i);
        }
        return res;
    }

    public static void recur(ListNode head){
        if (head == null) return;;
        recur(head.next);
        temp.add(head.val);
    }

}
