package Algorithm.DynamicProgramming;

public class RemoveDuplicates {
    static class Solution{
        public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
        //LeetCode26
        //去除数组中重复的元素，并返回剩余数字个数
        public int algorithm(int[] nums){
            int n = nums.length;
            if (n == 0) return 0;
            int slow = 0, fast = 1;
            while (fast < n){
                if (nums[slow] != nums[fast]){
                    slow++;
                    nums[slow] = nums[fast];
                }
                fast++;
            }
            return slow + 1;
        }
        //LeetCode83
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode slow = head;
            ListNode fast = head.next;
            while (fast != null){
                if (slow.val != fast.val) {
                    slow.next = fast;
                    slow = slow.next;
                }
                fast = fast.next;
            }
            slow.next = null;
            return head;
        }

    }
}
