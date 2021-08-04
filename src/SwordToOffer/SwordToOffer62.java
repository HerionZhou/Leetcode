package SwordToOffer;

import java.util.LinkedList;
import java.util.Queue;

public class SwordToOffer62 {
    static class Solution{
        public int algorithm(int n, int m){
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < n; i++) queue.offer(i);
            int count = m;
            while (true){
                if (queue.size() == 1) break;
                if (count > 1){
                    int temp = queue.poll();
                    queue.offer(temp);
                    count--;
                }else {
                    queue.poll();
                    count = m;
                }
            }
            return queue.peek();
        }
        //删到最后，剩下的数下标一定为0
        //倒推这个数在上一轮的下标
        public int algorithm1(int n, int m){
            int x = 0;
            for (int i = 2; i <= n; i++){
                x = (x + m) % i;
            }
            return x;

        }

    }

}
