package Algorithm.SwordToOffer;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class SwordToOffer59_2 {
    static class MaxQueue{
        LinkedList<Integer> queue;
        PriorityQueue<Integer> queueMax;
        public MaxQueue() {
            this.queue = new LinkedList<>();
            this.queueMax = new PriorityQueue<>(Collections.reverseOrder());
        }

        public int max_value() {
            if (queueMax.isEmpty()) return -1;
            return queueMax.peek();
        }

        public void push_back(int value) {
            queue.offer(value);
            queueMax.offer(value);
        }

        public int pop_front() {
            if (queue.isEmpty()) return -1;
            if (queue.peek() == queueMax.peek()) {
                queueMax.poll();
            }else {
                queueMax.remove(queue.peek());
            }
            return queue.poll();
        }
    }

    public static void main(String[] args) {
        MaxQueue queue = new MaxQueue();
        queue.push_back(1);
        queue.push_back(2);
        System.out.println(queue.max_value());
        System.out.println(queue.pop_front());
        System.out.println(queue.max_value());
    }

}
