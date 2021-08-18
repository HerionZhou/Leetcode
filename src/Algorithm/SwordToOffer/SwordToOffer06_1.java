package Algorithm.SwordToOffer;

import java.util.LinkedList;

public class SwordToOffer06_1 {
    // 使用LinkedList链表创建一个栈
    // 此为方法二，方法一见SwordToOffer06
    // 方法3：创建计数器，遍历链表得到长度，创建数组，二次遍历链表，给数组赋值：index=length ---> 0
    public  class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }

    public static int[] algorithm(ListNode head){
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (head != null){
            stack.addLast(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++){
            res[i] = stack.removeLast();
        }
        return res;
    }
}
