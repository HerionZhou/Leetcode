package DesignPattern.Strategy;

public class InsertSort implements ISort {
    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int idx = i - 1;
            while (idx >= 0){
                if (arr[idx] > temp){
                    arr[idx + 1] = arr[idx];
                }else break;
                idx--;
            }
            arr[idx + 1] = temp;
        }
    }
}
