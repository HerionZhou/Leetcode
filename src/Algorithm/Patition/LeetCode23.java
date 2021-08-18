package Algorithm.Patition;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode23 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution{
        //优先队列
        //每次将k个链表表头入队排序，取出队头为最小的元素，后将其下一个节点入队
        //反复取队头，直到队列没有元素结束
        public ListNode algorithm(ListNode[] lists){
            if (lists.length == 0 || (lists.length == 1 && lists[0] == null)) return null;
            PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
                @Override
                //o1是添加的新节点，o2是父节点
                //返回-1时将新节点往上移动
                public int compare(ListNode o1, ListNode o2) {
                    if (o1.val < o2.val) return -1;
                    else if (o1.val == o2.val) return 0;
                    else return 1;
                }
            });
            ListNode res = new ListNode(0); //res.next才是结果
            ListNode temp = res;
            for (ListNode node : lists){
                if (node != null) queue.offer(node);
            }

            while (!queue.isEmpty()){
                temp.next = queue.poll();
                temp = temp.next;
                if (temp.next != null) queue.offer(temp.next);
            }
            return res.next;
        }

        //分治：归并排序
        public ListNode algorithm1(ListNode[] lists){
            return null;
        }
    }
}
