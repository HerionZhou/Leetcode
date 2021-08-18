package Algorithm.SwordToOffer;

import java.util.*;

public class SwordToOffer59_1 {
    static class Solution{
        //暴力解法
        public int[] algorithm(int[] nums, int k){
            if (nums.length == 0) return new int[0];
            int l = 0, r = k - 1;
            List<Integer> list = new ArrayList<>();
            while (r < nums.length){
                int max = Integer.MIN_VALUE;
                for (int i = l; i <= r; i++){
                    max = Math.max(nums[i], max);
                }
                list.add(max);
                l++;
                r++;
            }
            int[] res = new int[list.size()];
            for (int i = 0; i< res.length; i++){
                res[i] = list.get(i);
            }
            return res;
        }
        //双向队列LinkedList实现了Deque的接口
        //维护队列递减，当前元素比队列内元素大，队列内元素出队后当前元素入队
        //如果队头元素跟上一个循环左边界相同，则出队丢弃
        //此时队头元素即窗口内最大元素
        public int[] algorithm1(int[] nums, int k){
            if (nums.length == 0) return new int[0];
            Deque<Integer> queue = new LinkedList<>();
            int[] res = new int[nums.length - k + 1];
            for (int i = 0; i < k; i++){
                while (!queue.isEmpty() &&  queue.peekLast() < nums[i])
                    queue.removeLast();
                queue.addLast(nums[i]);
            }
            res[0] = queue.peekFirst();
            for (int i = k; i < nums.length; i++){
                if (queue.peekFirst() == nums[i - k]) queue.removeFirst();
                while (!queue.isEmpty() && queue.peekLast() < nums[i])
                    queue.removeLast();
                queue.addLast(nums[i]);
                res[i - k + 1] = queue.peekFirst();
            }
            return res;
        }
    }

}
