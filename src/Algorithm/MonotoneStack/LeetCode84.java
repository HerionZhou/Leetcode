package Algorithm.MonotoneStack;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode84 {
    static class Solution{
        //柱状图中最大面积
        //单调栈
        public int algorithm(int[] heights){
            Deque<Integer> queue = new LinkedList<>();
            int res = 0;
            for (int i = 0; i < heights.length; i++) {
                while (!queue.isEmpty() && heights[queue.peek()] > heights[i]){
                    int cur = queue.pop();
                    int right = i;
                    int left = -1;
                    if (!queue.isEmpty()){
                        left = queue.peek();
                    }
                    int height = heights[cur];
                    res = Math.max(res, (right - left - 1) * height);
                }
                queue.push(i);
            }
            int right = heights.length;
            while (!queue.isEmpty()){
                int cur = queue.pop();
                int left = -1;
                if (!queue.isEmpty()){
                    left = queue.peek();
                }
                int height = heights[cur];
                res = Math.max(res, (right - left - 1) * height);
            }
            return res;
        }
    }
}
