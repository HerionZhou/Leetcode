package SwordToOffer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SwordToOffer66 {
    static class Solution{
        public int[] algorithm(int[] a){
            int[] res = new int[a.length];
            Arrays.fill(res, 1);
            Queue<Integer> queue = new LinkedList<>();
            for (int num :a){
                queue.offer(num);
            }
            for (int i = 0; i < a.length; i++){
//                int idx = i;
//                while (idx >= 0) {
//                    queue.offer(queue.poll());
//                    idx--;
//                }
                if (i == 0){
                    queue.offer(queue.poll());
                }else {
                    queue.offer(queue.poll());
                    queue.offer(queue.poll());
                }
                int count = a.length - 1;
                while (count > 0){
                    int temp = queue.poll();
                    res[i] *= temp;
                    queue.offer(temp);
                    count--;
                }
            }
            return res;
        }
    }
    //列出表格，分为左下，右上两部分
    public int[] algorithm1(int[] a){
        int[] res = new int[a.length];
        int temp = 1;
        for (int i = 0; i < a.length; i++){
            res[i] = temp;
            temp *= a[i];
        }
        temp = 1;
        for (int i = a.length - 1; i >= 0; i--){
            res[i] *= temp;
            temp *= a[i];
        }
        return res;
    }

}


















