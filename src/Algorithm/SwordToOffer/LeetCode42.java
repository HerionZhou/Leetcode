package Algorithm.SwordToOffer;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode42 {
    static class Solution{
        //接雨水
        //单调栈，按层接
        public int algorithm(int[] height){
            int res = 0;
            Deque<Integer> stack = new LinkedList<>();
            for (int i = 0; i < height.length; i++) {
                while (!stack.isEmpty() && height[stack.peek()] < height[i]){
                    int bottom = stack.pop();
                    if (stack.isEmpty()) break;
                    int left = stack.peek();
                    int right = i;
                    int water = (Math.min(height[left], height[right]) - height[bottom]) * (right - left - 1);
                    res += water;
                }
                stack.push(i);
            }
            return res;
        }
    }
}
