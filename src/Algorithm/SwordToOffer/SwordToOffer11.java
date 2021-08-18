package Algorithm.SwordToOffer;

public class SwordToOffer11 {
    //二分查找
    public static int algorithm(int[] numbers){
        int i = 0, j = numbers.length -1, temp;
        while (i < j){
            temp = (i + j) / 2;
            if (numbers[temp] > numbers[j]){
                i = temp + 1;
            }else if (numbers[temp] < numbers[j]){
                j = temp;
            }else {
                j--;
            }
        }
        return numbers[i];
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 3};
        System.out.println(algorithm(nums));
    }
}
