package DesignPattern.Strategy;

import java.util.Arrays;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Sort sort = new Sort(SortStrategy.SelectSort);
        int[] arr = {2,4,2,6,9,12,7};
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
