package Algorithm.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LeetCode969 {
    static class Solution{
        List<Integer> res = new ArrayList<>();
        public List<Integer> algorithm(int[] arr){
            recur(arr, arr.length);
            return res;
        }

        public void recur(int[] arr, int len){
            if (len == 1) return;
            int max = 0;
            int maxIndex = 0;
            for (int i = 0; i < len; i++) {
                if (arr[i] > max){
                    max = arr[i];
                    maxIndex = i;
                }
            }
            res.add(maxIndex + 1);
            reverse(arr, 0, maxIndex);
            res.add(len);
            reverse(arr, 0, len - 1);

            recur(arr, len - 1);
        }

        public void reverse(int[] arr, int l, int r){
            while (l < r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3, 2, 4, 1};
        List<Integer> res = solution.algorithm(arr);
        System.out.println(res.toString());
    }

}
