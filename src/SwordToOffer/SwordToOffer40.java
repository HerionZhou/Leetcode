package SwordToOffer;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class SwordToOffer40 {
    //topK问题
    static class Solution{
        //冒泡
        public int[] algorithm(int[] arr, int k){
            for (int i = 0; i < k; i++){
                for (int j = i + 1; j < arr.length; j++){
                    if(arr[i] >= arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            return Arrays.copyOfRange(arr, 0, k);
        }
        //优先队列（大顶堆、小顶堆）
        //PriorityQueue默认小顶堆
        //改成小顶堆：PriorityQueue(c, (x1, x2) -> Integer.compare(x2, x1))
        public int[] algorithm1(int[] arr, int k){
            if(k == 0) return new int[0];
            Queue<Integer> heap = new PriorityQueue<>(k, (l1, l2) -> Integer.compare(l2, l1));
            for (int num : arr){
                if (heap.isEmpty() || heap.size() < k || num < heap.peek()){
                    heap.offer(num);
                }
                if (heap.size() > k) heap.poll();
            }
            int[] res = new int[heap.size()];
            int j = 0;
            for (int num : heap){
                res[j++] = num;
            }
            return res;
        }
        //快速选择
        public int[] algorithm2(int[]arr, int k){
            if (k == 0) return new int[0];
            if (k >= arr.length) return arr;
            return quickSelect(arr, 0, arr.length -1, k);
        }

        public int[] quickSelect(int[] arr, int l, int r, int k){
            int i = l, j = r;
            while (i < j){
                while (i < j && arr[j] >= arr[l]) j--;
                while (i < j && arr[i] <= arr[l]) i++;
                swap(arr, i, j);
            }
            swap(arr, l, i);
            if (i > k) quickSelect(arr, l, i - 1, k);
            if (i < k) quickSelect(arr, i + 1, r, k);
            return Arrays.copyOf(arr, k);
        }

        public void swap (int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}
