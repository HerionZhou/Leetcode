package Algorithm.SwordToOffer;

public class SwordToOffer39 {
    public static int algorithm(int[] nums){
        int votes = 0, x = 0;
        for (int num: nums){
            if (votes == 0) x = num;
            votes += num == x ? 1 : -1;
        }
        return x;
    }
}
