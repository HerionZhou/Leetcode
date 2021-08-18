package Algorithm.SwordToOffer;

import java.util.ArrayList;
import java.util.List;

public class SwordToOffer57_2 {
    static class Solution{
        public int[][] algorithm(int target){
            List<int[]> res = new ArrayList<>();
            int l = 1, r = 2;
            int sum = 3;
            while (l < r){
                if (sum < target){
                   r++;
                   sum += r;
               } else if (sum > target){
                    sum -= l;
                    l++;
               } else{
                    int[] temp = new int[r - l + 1];
                    int t = 0;
                    for (int i = l; i <= r; i++){
                        temp[t++] = i;
                    }
                    res.add(temp);
                    sum -= l;
                    l++;
               }
            }
            return res.toArray(new int[0][]);
        }

    }

}
