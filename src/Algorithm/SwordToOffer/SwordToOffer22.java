package Algorithm.SwordToOffer;

import java.util.ArrayList;
import java.util.List;

public class SwordToOffer22 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    //使用ArrayList存储各个链表节点，用索引输出
    public static ListNode algorithm(ListNode head, int k){
        List<ListNode> nodeList = new ArrayList<ListNode>();
        while (head != null){
            nodeList.add(head);
            head = head.next;
        }
        return nodeList.get(nodeList.size() - k);
    }
    //定义双指针，former先走k步，之后former，latter一起走到former = null，latter即为所得
    public static ListNode algorithm1(ListNode head, int k){
        ListNode former = head, latter = head;
        for (int i = 0; i < k; i++){
            former = former.next;
        }
        while (former != null){
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }
}
