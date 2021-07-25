package SwordToOffer;

import java.util.PriorityQueue;
import java.util.Queue;

public class SwordToOffer41 {
    //大顶堆存较小的一半，顶部元素是较小一半最大的；小顶堆存较大的一半，顶部元素是较大一半最小的
    //个数相同：存入小顶堆，再将小顶堆顶部元素存入大顶堆
    //个数不同：存入大顶堆，再将大顶堆顶部元素存入小顶堆
    static class MedianFinder{
        Queue<Integer> minHeap, maxHeap;
        public MedianFinder(){
            maxHeap = new PriorityQueue<>((x1, x2) -> Integer.compare(x2, x1));
            minHeap = new PriorityQueue<>();
        }

        public void addNum(int num){
            int temp;
            if (minHeap.size() == maxHeap.size()){
                minHeap.offer(num);
                temp = minHeap.poll();
                maxHeap.offer(temp);
            }else {
                maxHeap.offer(num);
                temp = maxHeap.poll();
                minHeap.offer(temp);
            }
        }

        public double findMedian(){
            if (minHeap.size() != maxHeap.size()){
                return (double)minHeap.peek();
            }else {
                return (double)(minHeap.peek() + maxHeap.peek()) / 2;
            }
        }
    }
}
